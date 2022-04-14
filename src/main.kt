fun main(){
    var pen=Product("Bic",10.5,30,"Other")
    var towel=Product("Victoria secret",5.1,300,"Hygiene")
    var vegies=Product("cabbage",25.1,60,"groceries")


  println(  isEven(5))
 fruits("Banana")

}





fun isEven(num:Int):Boolean{
    return(num%2==0)



}
data class Product (var name:String,var weight:Double,var price:Int,var category:String)
fun takeoro(name:Product){
    var prd= mutableListOf<Product>()
    when(name.category){
        "other"->println(prd.add(name))
    }
}
fun fruits(fruit: String):String{
    println(fruit[0].toString()+fruit[2]+fruit[4])
    return fruit
}
fun names(names:Array<String>):List<String>{
    var des= mutableListOf<String>()
    names.forEach { m->
        if (m%2==0){
            des.add(m)
        }

    }
return des


}





/

// A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//

//. Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//“bnn”

