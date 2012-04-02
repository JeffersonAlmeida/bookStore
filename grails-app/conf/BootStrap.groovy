import bookstore.*
class BootStrap {

    def init = { servletContext ->
        
        if(!Book.count()){
            def author = new Author(name: "Dierk konig").save()
            def book = new Book(title:"Groovy in Action").save()
        }
       
    }
    def destroy = {
    }
    
}
