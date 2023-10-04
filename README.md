# Banco Criado em Java

Tecnologias utilizadas:
    Scanner
    Random
Feito por João Emanuel - Bootcamp Java da DIO;

Classe User - 
    Tem os atributos do Cliente, junto das propriedades Agência e Número que são geradas, automaticamente a cada execução, usando da classe Random.
Classe ContaTerminal-
    É aonde é executado o código via terminal, utilizando da classe Scanner para buscar os valores introduzidos por input e atribui-los ao objeto instanciado User.

## Metodos

setAgencia: Gera um int aleatorio de no máximo 3 digitos, sendo de 000 a 999 e outro int de apenas 1 digito, sendo de 0 a 9; 
            Cria a String agencia, onde esses valores são concatenados para forma no modelo "123-4" e por fim atribuidos a propriedade "Agencia", retornando esse valor.

setNumero: Gera um int aleatorio de no máximo 5 digitos, sendo de 00000 a 99999, atribuindo a propriedade "Numero", retornando esse valor.