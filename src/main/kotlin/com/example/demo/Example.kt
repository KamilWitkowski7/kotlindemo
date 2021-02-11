import com.example.demo.TestCommand
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TestEndpoint(private val testCommandHandler: CommandHandler<TestCommand, Unit>) {

    @PostMapping("/aaa")
    fun testMethod(@RequestBody command: TestCommand): ResponseEntity<Void>? {
        testCommandHandler.handle(command)
        return null
    }
}