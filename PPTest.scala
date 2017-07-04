/*
 * "C Preprocessor-like" DSL for Scala
 * 
 * Derek Hudson
 * Thomas Chenette
 * Matthew Chenette
 * 
 * CS345 - Assignment 5
 * 
 * 
 * This is a file that demonstrates and tests the "C preprocessor"-style DSL. 
 * This particular file is meant to demonstrate what is possible with our DSL 
 * without restricting its syntax (as is seen in the "C-Style" file).
 *
 * Note: to change the functionality of the "preprocessor" change what PPTest extends
 * 
 */

object PPTest extends ScalaPPDSLv2{
    def self(i:Double) = {
       i 
    }
    /// uncommenting the function below showcases an example of ambiguity 
    /// that would require the user to specify type in order to call self()
    /*def self(i:Int) = {
        i
    }*/
    def main(args:Array[String]) = {
        ### define 'x as 100.0
        ### define 'fun as ((x:Int, y:Int)=>{x>y})
        ### ifdefined 'y then (()=>{println("y defined")}) elifdef 'x then (()=>{println("x defined")}) endif
        
        ### define 'y as ('x ?)
       
       ### іf (('y DOUBLE)>5.0) then (()=>{
         ### іf (('y DOUBLE)<100.0) then (()=>println("y < 100 and y > 5"))
         ### еlsе (()=>println("y >= 100")) endif
       })
       ### elif (('y DOUBLE)<5.0) then (()=>{println("y < 5")})
       ### еlsе (()=>{println("y == 5")})
       ### endif
        
        var y:Double = 'x;
        println(y);
        self('x)
        println(self('x))
        
        ### warning "println(Symbol) is an ambiguous call"
        println('x)
        println('x DOUBLE)
        //### error "This is a test error."
        
        ()
    }
}
