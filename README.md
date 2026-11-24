# Sistema de Gestão de Lava Rápido (MVC)

Projeto desenvolvido para a disciplina de Análise Orientada a Objetos. Consiste em um sistema desktop em Java Swing para gerenciar clientes e agendamentos de um lava rápido, aplicando a arquitetura MVC.

## Estrutura do Projeto
- **model**: Contém as entidades do sistema (`Cliente`, `TipoServico`, `Agendamento`).
- **controller**: Contém as regras de negócio e validações de agenda.
- **view**: Interface gráfica construída com Java Swing (`TelaPrincipal`).
- **app**: Classe `Main` para inicialização do sistema.

## Funcionalidades
- Cadastro e edição de clientes.
- Cadastro de novos tipos de serviço.
- Agendamento de serviços com validação de conflito de horário.
- Visualização e cancelamento de agendamentos na tabela.

## Como Executar
1. Abra o projeto no NetBeans.
2. Execute a classe `app.Main`.

## Documentação
A documentação completa com os diagramas UML está disponível nos arquivos `TXT.LavaRapido.docx` e `UML.LavaRapido.png` neste repositório.
