package com.example.demo

import CommandHandler
import org.springframework.stereotype.Component

@Component
class OtherCommandHandler(): CommandHandler<OtherCommand, Unit> {

    override fun handle(command: OtherCommand) {
    }
}