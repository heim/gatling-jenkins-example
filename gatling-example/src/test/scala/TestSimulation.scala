import com.excilys.ebi.gatling.core.Predef._ 
import com.excilys.ebi.gatling.http.Predef._
import com.excilys.ebi.gatling.jdbc.Predef._
import akka.util.duration._
import bootstrap._
import assertions._

class TestSimulation extends Simulation { 
  val scn = scenario("My scenario")
    .exec(http("My Page")
    .get("http://192.168.1.2:8000")) 
      
  setUp(scn.users(10)) 
}
