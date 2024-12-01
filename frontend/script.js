fetch('http://localhost:8080/api/hello')
  .then(response => response.text())
  .then(data => console.log(data)); // Output: "Hello from CG by spigrootdev!"
