### Exception Class

Die Klasse Exception und ihre Unterklassen sind eine Form von Throwable, die Bedingungen anzeigt, die eine vernünftige Anwendung möglicherweise abfangen möchte. Die Klasse Exception und alle Unterklassen, die nicht auch Unterklassen von RuntimeException sind, sind geprüfte Ausnahmen.

### throws

Das throws-Schlüsselwort in Java wird verwendet, um Ausnahmen zu deklarieren, die während der Ausführung eines Programms auftreten können. Für jede Methode, die Ausnahmen auslösen kann, ist es zwingend erforderlich, das throws-Schlüsselwort zu verwenden, um die Ausnahmen aufzulisten, die ausgelöst werden können.

### throw

Das throw-Schlüsselwort in Java wird zum expliziten Auslösen einer einzelnen Ausnahme verwendet. Dies kann innerhalb einer Methode oder eines beliebigen Codeblocks erfolgen. Mit dem throw-Schlüsselwort können sowohl aktivierte als auch nicht aktivierte Ausnahmen ausgelöst werden.

### try-catch-finally

Der Try-Block enthält den Code, der möglicherweise eine Ausnahme auslöst. Der Catch-Block enthält den Exception-Handler für Ausnahmen im try-Block. Der finally-Block enthält den kritischen Code, der unabhängig davon ausgeführt wird, ob die Ausnahme aufgetreten ist oder nicht.