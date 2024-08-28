// Função para enviar dados e criar um novo usuário
function submitForm() {
    const form = document.getElementById('user-form');
    const formData = new FormData(form);
    const data = {
        name: formData.get('name'),
        age: formData.get('age'),
        gender: formData.get('gender')
    };

    fetch('http://localhost:8080/users', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    })
    .then(response => {
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(() => {
        // Após criar o usuário, atualize a lista de usuários
        fetchUsers();
    })
    .catch(error => {
        console.error('Error:', error);
        document.getElementById('user-list').innerText = 'Error: ' + error.message;
    });
}

// Função para buscar e exibir todos os usuários
function fetchUsers() {
    fetch('http://localhost:8080/users')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            return response.json();
        })
        .then(users => {
            displayUsers(users);
        })
        .catch(error => {
            console.error('Error:', error);
            document.getElementById('user-list').innerText = 'Error: ' + error.message;
        });
}

// Função para exibir os usuários na página
function displayUsers(users) {
    const resultElement = document.getElementById('user-list');
    resultElement.innerHTML = '';

    if (Array.isArray(users)) {
        const ul = document.createElement('ul');
        users.forEach(user => {
            const li = document.createElement('li');
            li.textContent = `ID: ${user.id}, Nome: ${user.name}, Idade: ${user.age}, Sexo: ${user.gender}`;
            ul.appendChild(li);
        });
        resultElement.appendChild(ul);
    } else {
        resultElement.innerText = JSON.stringify(users);
    }
}

// Carregar a lista de usuários quando a página for carregada
document.addEventListener('DOMContentLoaded', fetchUsers);