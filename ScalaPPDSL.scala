/*
 * "C Preprocessor-like" DSL for Scala
 * 
 * Derek Hudson
 * Thomas Chenette
 * Matthew Chenette
 * 
 * CS345 - Assignment 5
 * 
 * Note: Version 1 - only inline if/elif/else available
 *       uses keywords elif, elifdef, elifndef
 *       any "elif" flavor can follow any "if" flavor
 * 
 */

import scala.collection.mutable

  class ScalaPPDSL {
    val storage = new mutable.HashMap[Symbol, Any]
    
    case class consumeSymbol(s: Symbol) {
        def ?() = storage(s) // have to cast to what type they want
        def ?(a1:Any) = storage(s).asInstanceOf[(Any)=>Any] (a1)
        def ?(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Any] (a1, a2)
        def ?(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Any] (a1, a2, a3)
        def ?(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Any] (a1, a2, a3, a4)
        def ?(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Any] (a1, a2, a3, a4, a5)
        def ?(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Any] (a1, a2, a3, a4, a5, a6)
        
        def INT() = storage(s).asInstanceOf[Int]
        def INT(a1:Any) = storage(s).asInstanceOf[(Any)=>Int] (a1)
        def INT(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Int] (a1, a2)
        def INT(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Int] (a1, a2, a3)
        def INT(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Int] (a1, a2, a3, a4)
        def INT(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Int] (a1, a2, a3, a4, a5)
        def INT(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Int] (a1, a2, a3, a4, a5, a6)
        
        def LONG() = storage(s).asInstanceOf[Long]
        def LONG(a1:Any) = storage(s).asInstanceOf[(Any)=>Long] (a1)
        def LONG(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Long] (a1, a2)
        def LONG(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Long] (a1, a2, a3)
        def LONG(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Long] (a1, a2, a3, a4)
        def LONG(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Long] (a1, a2, a3, a4, a5)
        def LONG(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Long] (a1, a2, a3, a4, a5, a6)
        
        def DOUBLE() = storage(s).asInstanceOf[Double]
        def DOUBLE(a1:Any) = storage(s).asInstanceOf[(Any)=>Double] (a1)
        def DOUBLE(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Double] (a1, a2)
        def DOUBLE(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Double] (a1, a2, a3)
        def DOUBLE(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Double] (a1, a2, a3, a4)
        def DOUBLE(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Double] (a1, a2, a3, a4, a5)
        def DOUBLE(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Double] (a1, a2, a3, a4, a5, a6)
        
        def STRING() = storage(s).asInstanceOf[String]
        def STRING(a1:Any) = storage(s).asInstanceOf[(Any)=>String] (a1)
        def STRING(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>String] (a1, a2)
        def STRING(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>String] (a1, a2, a3)
        def STRING(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>String] (a1, a2, a3, a4)
        def STRING(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>String] (a1, a2, a3, a4, a5)
        def STRING(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>String] (a1, a2, a3, a4, a5, a6)
        
        def CHAR() = storage(s).asInstanceOf[Char]
        def CHAR(a1:Any) = storage(s).asInstanceOf[(Any)=>Char] (a1)
        def CHAR(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Char] (a1, a2)
        def CHAR(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Char] (a1, a2, a3)
        def CHAR(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Char] (a1, a2, a3, a4)
        def CHAR(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Char] (a1, a2, a3, a4, a5)
        def CHAR(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Char] (a1, a2, a3, a4, a5, a6)
        
        def BOOL() = storage(s).asInstanceOf[Boolean]
        def BOOL(a1:Any) = storage(s).asInstanceOf[(Any)=>Boolean] (a1)
        def BOOL(a1:Any, a2:Any) = storage(s).asInstanceOf[(Any, Any)=>Boolean] (a1, a2)
        def BOOL(a1:Any, a2:Any, a3:Any) = storage(s).asInstanceOf[(Any, Any, Any)=>Boolean] (a1, a2, a3)
        def BOOL(a1:Any, a2:Any, a3:Any, a4:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any)=>Boolean] (a1, a2, a3, a4)
        def BOOL(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any)=>Boolean] (a1, a2, a3, a4, a5)
        def BOOL(a1:Any, a2:Any, a3:Any, a4:Any, a5:Any, a6:Any) = storage(s).asInstanceOf[(Any, Any, Any, Any, Any, Any)=>Boolean] (a1, a2, a3, a4, a5, a6)
    }
    
    class preprocesses(s:Symbol) {
        var tempSymb: Symbol = s;
        object asInstances {  
            def as(a:Any) = {////functions must be in (), functions have max of 6 arguments
                storage.put(tempSymb, a);
            }
        }
        class endifClass(){
            def endif() = {}
        }
        class elifClass(b:Boolean){
            val bool = b
            def endif() = {}
            def elif(ab: Boolean) = {new thenClass(ab, bool)}
            def elifdef(x:Symbol) = {new thenClass(storage.contains(x), bool)}
            def elifndef(x:Symbol) = {new thenClass(!storage.contains(x), bool)}

            def еlsе(fn:()=>Any) = {//////////U+0435 is "е"
                if(!bool){
                    fn()
                }
                new endifClass()
            }
        }
        class thenClass(b:Boolean, c:Boolean) {
            val bool = b
            val accum = c
            def then(fn:()=>Any) = {
                if (bool && !accum){
                    fn()
                }
                new elifClass(bool || accum)
            }
        }
        def define(x:Symbol) = {
            tempSymb = x
            asInstances
        }
        def іf(fn:Boolean) = {/////////U+0456 is "і"
            new thenClass(fn, false)
        }
        def ifdefined(x:Symbol) = {
            new thenClass(storage.contains(x), false)
        }
        def ifnotdefined(x:Symbol) = {
            new thenClass(!storage.contains(x), false)
        }
        def undefine(x:Symbol) = {
           storage.remove(x)
        }
        def warning(s:String) = {
            System.err.println(s);
        }
        def error(s:String) = {
            throw new Error(s)
        }
    }
    
    var ### =  new preprocesses('_)
    def __defined__(s:Symbol)=storage.contains(s)/////////////calls must use ()
    implicit def symbol2print(s:Symbol) = consumeSymbol(s)
    implicit def any2int(s: Symbol) = storage(s).asInstanceOf[Int]
    implicit def any2long(s: Symbol) = storage(s).asInstanceOf[Long]
    implicit def any2double(s: Symbol) = storage(s).asInstanceOf[Double]
    implicit def any2string(s: Symbol) = storage(s).asInstanceOf[String]
    implicit def any2bool(s: Symbol) = storage(s).asInstanceOf[Boolean]
    implicit def any2char(s: Symbol) = storage(s).asInstanceOf[Char]
 }
