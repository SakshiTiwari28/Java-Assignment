//Book Constructor

function Book(title,author,isbn){
    this.title =title;
    this.author =author;
    this.isbn = isbn;
}
//UI Constructor

function UI(){}

//event listener

document.getElementById('book-form').addEventListener('submit',function(e){
    
    const title = document.getElementById('book')
    e.preventDefault();
})

