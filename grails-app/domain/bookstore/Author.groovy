package bookstore

class Author { 
   
    String name
    static constraints = {
        name(blank:false)
    }   
    static hasMany = [books: Book]
    
    
}
