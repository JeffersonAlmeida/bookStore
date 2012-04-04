package bookstore

class Book {
    
    String title
    static constraints = {
        title(blank:false)
    }    
    static belongsTo = [author: Author]
    
}
