# Grammar

```
grammar org.ppgti.mydsl.MyDSL with org.eclipse.xtext.common.Terminals

generate myDSL "http://www.ppgti.org/mydsl/MyDSL"

Pessoas:
	baseDados += Pessoa*;
	
Pessoa:
	'Pessoa' nome=ID sobrenome=ID ';';
```

# Example

```
Pessoa Alvaro Ferreira ;

Pessoa Rebeka Ferraz ;
```

## Output

```java
class Main {
	public static void main (String[] args) {
System.out.println("Pessoa: Alvaro Ferreira");
System.out.println("Pessoa: Rebeka Ferraz");
	}
}
```
