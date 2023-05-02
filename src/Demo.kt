import kotlin.properties.Delegates

fun main(args: Array<String>) {
	var n:Int by Delegates.observable(20){property,oldValue,newValue->
		println("Old Value: $oldValue")
		println("New Value: $newValue")
	}
	
	println("Default Value : $n\n")
	
	println("On value Change")
	n=22
	
	println("On again value Change")
	n=98
	
	//Basically this Delegate proptery will act as value listener
}