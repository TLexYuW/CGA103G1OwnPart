(() =>{

    fetch("header.html")
        .then(response => {
            return response.text()
        })
        .then(data => {
            document.querySelector("header").innerHTML = data;
        });
    
    fetch("footer.html")
        .then(response => {
            return response.text()
        })
        .then(data => {
            document.querySelector("footer").innerHTML = data;
        });
    fetch("memSideBar.html")
        .then(response => {
            return response.text()
        })
        .then(data => {
            document.querySelector("#sidebar").innerHTML = data;
        });   
    fetch("memBanner.html")
        .then(response => {
            return response.text()
        })
        .then(data => {
            document.querySelector("#banner").innerHTML = data;
        });       
})();

