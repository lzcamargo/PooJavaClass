package demonstracao;

public interface ReproduzStreaming extends Streaming {
	default public void proxima() {
    System.out.println("Próxima de ReproduzirStreaming");
}

}
