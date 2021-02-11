import com.example.demo.TestCommand
import org.springframework.stereotype.Component

@Component
class TestCommandHandler(): CommandHandler<TestCommand, Unit> {

    override fun handle(command: TestCommand) {
    }
}