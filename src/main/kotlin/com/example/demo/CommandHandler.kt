interface CommandHandler<Q: Command, R> {
    fun handle(command: Q): R
}