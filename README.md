# Lexical Analysis with VC Language
Lexical Analysis is the process of analyzing a sequence of characters or symbols in a program to produce a sequence of meaningful tokens, also known as lexemes.
The process involves breaking down the program's source code into a series of tokens or words, which represent the language's basic building blocks such as keywords, identifiers, operators, constants, and punctuation symbols. 

## Token

There are 5 types of tokens for VC Language: identifiers(ID), keywords(KW), operators(OP), separators(SE) and (LI)literals.

```java
public class Token {
    public String type;
    public String value;

    public Token(String type, String value) {
        this.type = type;
        this.value = value;
    }
}

```

## Lexical Scanner
We initialize arrays with known tokens and a array token.

```java
ArrayList<Token> tokens = new ArrayList<>();
String[] OP = {"+", "-", "*", "/", "<", "<=", ">", ">=", "==", "!=", "||", "&&", "!", "="};
String[] SE = {"{", "}", "(", ")", "[", "]", ";", ","};
String[] KW = {"boolean", "break", "continue", "else", "for", "float" ,"if", "int", "return", "void","while"};
```
Then scan each character to identify tokens, then classify into 1 of 5 types of tokens and then add an array of tokens to output.
We only use if else, for, while statements along with the switch case to identify and categorize tokens.

```java
String token_now = "";
while (i < text.length()-1){
    Character ch = text.charAt(i);
    token_now += ch;
    for (int x = 0; x < SE.length; x++){
        if (SE[x].equals(token_now)){
            tokens.add(new Token("SE", token_now));
            i += 1;
            token_now = "";
            break;
    }   
}
```

