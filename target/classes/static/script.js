document.addEventListener("DOMContentLoaded", () => {
    const blogPosts = document.getElementById("blogPosts");

    fetch("/api/posts")
        .then(response => response.json())
        .then(posts => {
            posts.forEach(post => {
                const postElement = document.createElement("div");
                postElement.innerHTML = `
          <h2>${post.title}</h2>
          <p>${post.content}</p>
        `;
                blogPosts.appendChild(postElement);
            });
        })
        .catch(error => console.error("Error fetching blog posts:", error));
});
