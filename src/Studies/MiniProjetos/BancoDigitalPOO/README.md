# Banco digital com POO

_Incrementação de abtrações no dominio bancario desenvolvido atráves do [repositorio](https://github.com/falvojr/lab-banco-digital-oo) da [DIO](https://www.dio.me) (Digital Inovation One.)_

### Representação do Dominio Bancario

```mermaid
classDiagram
    class Banco {
        -String nome
        -List~Conta~ contas
        +getNome() String
        +setNome(nome String) void
        +getContas() List~Conta~
        +setContas(contas List~Conta~) void
        +adicionarConta(conta Conta) void
        +imprimirRelatorio() void
    }

    class Cliente {
        -String nome
        +getNome() String
        +setNome(nome String) void
    }

    class IConta {
        <<interface>>
        +sacar(valor double) void
        +depositar(valor double) void
        +transferir(valor double, contaDestino IConta) void
        +imprimirExtrato() void
        +getNumero() int
        +getSaldo() double
    }

    class Conta {
        #int agencia
        #int numero
        #double saldo
        #Cliente cliente
        #List~String~ historicoTransacoes
        +Conta(cliente Cliente)
        +sacar(valor double) void
        +depositar(valor double) void
        +transferir(valor double, contaDestino IConta) void
        +getAgencia() int
        +getNumero() int
        +getSaldo() double
        +imprimirExtrato() void
        #registrarTransacao(transacao String) void
    }

    class ContaCorrente {
        +ContaCorrente(cliente Cliente)
        +sacar(valor double) void
        +imprimirExtrato() void
        -static final double TAXA_SAQUE
    }

    class ContaPoupanca {
        +ContaPoupanca(cliente Cliente)
        +imprimirExtrato() void
    }

    class ContaSalario {
        +ContaSalario(cliente Cliente)
        +imprimirExtrato() void
    }

    Banco --> Conta : contas *
    Conta *-- Cliente : cliente
    Conta ..|> IConta
    ContaCorrente --> Conta
    ContaPoupanca --> Conta
    ContaSalario --> Conta
```
