document.addEventListener('DOMContentLoaded', function() {
    const themeToggle = document.getElementById('themeToggle');
    const themeIcon = document.getElementById('themeIcon');
    
    // Check for saved theme preference or use preferred color scheme
    const savedTheme = localStorage.getItem('theme') || 
                      (window.matchMedia('(prefers-color-scheme: dark)').matches ? 'dark' : 'light');
    
    // Apply the saved theme
    if (savedTheme === 'dark') {
        document.documentElement.setAttribute('data-theme', 'dark');
        themeIcon.textContent = '☀️';
        themeToggle.innerHTML = '<span id="themeIcon">☀️</span> Light Mode';
    }
    
    // Toggle theme on button click
    themeToggle.addEventListener('click', function() {
        let currentTheme = document.documentElement.getAttribute('data-theme');
        if (currentTheme === 'dark') {
            document.documentElement.removeAttribute('data-theme');
            localStorage.setItem('theme', 'light');
            themeIcon.textContent = '🌙';
            themeToggle.innerHTML = '<span id="themeIcon">🌙</span> Dark Mode';
        } else {
            document.documentElement.setAttribute('data-theme', 'dark');
            localStorage.setItem('theme', 'dark');
            themeIcon.textContent = '☀️';
            themeToggle.innerHTML = '<span id="themeIcon">☀️</span> Light Mode';
        }
    });
});



document.getElementById('mobileNo').addEventListener('input', function() {
    const mobileInput = this;
    const regex = /^[6-9]\d{9}$/;
    
    if (regex.test(mobileInput.value)) {
        mobileInput.classList.remove('is-invalid');
        mobileInput.classList.add('is-valid');
    } else {
        mobileInput.classList.remove('is-valid');
        mobileInput.classList.add('is-invalid');
    }
});

document.getElementById('email').addEventListener('input', function() {
    validateEmailInput(this);
});

function validateEmailInput(input) {
    const value = input.value.trim();
    const isValid = /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(value);
    
    // Visual feedback
    input.classList.toggle('is-invalid', !isValid);
    input.classList.toggle('is-valid', isValid);
    
    return isValid;
}

// Form submission validation
document.querySelector('form').addEventListener('submit', function(e) {
    const emailInput = document.getElementById('email');
    if (!validateEmailInput(emailInput)) {
        e.preventDefault();
        emailInput.focus();
    }
});
