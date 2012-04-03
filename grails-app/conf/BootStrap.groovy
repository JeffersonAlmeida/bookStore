import bookstore.*
class BootStrap {

    def init = { servletContext ->        
        if(!Book.count()){
            def author = new Author(name: "Dierk konig").save()
            def authorJ = new Author(name: "Jefferson Almeida").save()
        }      
    }
    def destroy = {
    }
    
}
