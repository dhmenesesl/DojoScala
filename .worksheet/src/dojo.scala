object dojo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(31); 
  val lista = List(1, 2, 3, 4);System.out.println("""lista  : List[Int] = """ + $show(lista ));$skip(29); 
  val set = Set(1,2,3,4,5,1);System.out.println("""set  : scala.collection.immutable.Set[Int] = """ + $show(set ));$skip(43); 
  val mapa = Map(1 -> "Luis", 2 -> "Juan");System.out.println("""mapa  : scala.collection.immutable.Map[Int,String] = """ + $show(mapa ));$skip(44); val res$0 = 
  
  lista.map{x => x + 3}.filter(x => x<5);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(48); 
  
  val names = List("Luis", "pedro", "pablo");System.out.println("""names  : List[String] = """ + $show(names ));$skip(24); val res$1 = 
  names.map(_.length());System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(76); 

	val lista2 = List(List("Darwin", "24 years"), List("Nilton", "22 years"));System.out.println("""lista2  : List[List[String]] = """ + $show(lista2 ));$skip(46); val res$2 = 
	lista2.filter(_.apply(0)=="Darwin");System.out.println("""res2: List[List[String]] = """ + $show(res$2));$skip(43); val res$3 =  //forma1
	
	lista2.filter(_(0)== "Darwin");System.out.println("""res3: List[List[String]] = """ + $show(res$3));$skip(47);  //forma2
	
	val numeros = List(1,2,3,4,5,6,7,8,9,10,11);System.out.println("""numeros  : List[Int] = """ + $show(numeros ));$skip(85); val res$4 = 
	
	numeros.filter{x=>numeros.filter{y=>y<=Math.sqrt(x)}.filter{z=>x%z==0}.length==1};System.out.println("""res4: List[Int] = """ + $show(res$4))}
	
	
}
