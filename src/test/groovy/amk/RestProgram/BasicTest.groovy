package amk.RestProgram;
import spock.lang.Specification

class BasicTest extends Specification {
	

	
	public 'test'() {
println "let this work"
	  }
	  
	  def "Multiply: #a * #b = #expectedResult"()
	  {
		  given: "Calculator"
   
		  when: "multiply"
		  def result =  a * b
   
		  then: "result is as expected"
		  result == expectedResult
		  println "result = ${result}"
   
		  where:
		  a  | b | expectedResult
		  1  | 2 | 2
		  -5 | 2 | -10
	  }
	
}