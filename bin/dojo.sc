object dojo {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val lista = List(1, 2, 3, 4)                    //> lista  : List[Int] = List(1, 2, 3, 4)
  val set = Set(1,2,3,4,5,1)                      //> set  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  val mapa = Map(1 -> "Luis", 2 -> "Juan")        //> mapa  : scala.collection.immutable.Map[Int,String] = Map(1 -> Luis, 2 -> Jua
                                                  //| n)
  
  lista.map{x => x + 3}.filter(x => x<5)          //> res0: List[Int] = List(4)
  
  val names = List("Luis", "pedro", "pablo")      //> names  : List[String] = List(Luis, pedro, pablo)
  names.map(_.length())                           //> res1: List[Int] = List(4, 5, 5)

	val lista2 = List(List("Darwin", "24 years"), List("Nilton", "22 years"))
                                                  //> lista2  : List[List[String]] = List(List(Darwin, 24 years), List(Nilton, 22 
                                                  //| years))
	lista2.filter(_.apply(0)=="Darwin") //forma1
                                                  //> res2: List[List[String]] = List(List(Darwin, 24 years))
	
	lista2.filter(_(0)== "Darwin") //forma2   //> res3: List[List[String]] = List(List(Darwin, 24 years))
	
	val numeros = List(1,2,3,4,5,6,7,8,9,10,11)
                                                  //> numeros  : List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
	
	numeros.filter{x=>numeros.filter{y=>y<=Math.sqrt(x)}.filter{z=>x%z==0}.length==1}
                                                  //> res4: List[Int] = List(1, 2, 3, 5, 7, 11)
	
	
}