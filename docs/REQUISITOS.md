# Requisitos
Requisitos de gerenciamento de marcação de consulta da **Clinica Saúde+**

---

## Lista de Stakeholders (Personas).

- Médicos

- Pacientes

- Administrador(Recepcionista)

---

## Requisitos Funcionais(RF)

- O sistema deve permitir que o paciente visualize a agenda com os horários livres.

- O sistema deve permitir que o paciente faça a requisição de agendamento e remanejamento.

- O sistema deve ocupar o horário assim que o paciente confirmar a requisição

- O sistema deve permitir que as recepcionistas aprovem as requisições de agendamento.

- O sistema deve enviar mensagens no aplicativo e email dizendo se houve confirmação ou indisponibilidade no horário requisitado.

- O sistema deve permitir que o médico visualize toda a agenda.

- O sistema deve permitir que as recepcionistas enviem requisições de encaixe de consultas para o médico por email e mensagem

- O sistema deve permitir que o paciente cancele o agendamento feito.

- O sistema deve permitir o cadastro e login de usuários em diferentes níveis (Médicos, pacientes e administradores.)

- O sistema deve permitir que o usuário modifique os dados do cadastro

- O sistema deve permitir a redefinição da senha do usuário

 ---
  
## Requisitos Não Funcionais(RNF)

- Compatibilidade: O sistema deve ser PWA (Rodar em diversas plataformas: computador e celulares.) 

- Confiabilidade: O sistema deve estar disponível 99,5% do tempo.

- Segurança: O sistema deve criptografar todas as senhas.

- Performance: O sistema deve realizar a marcação da consulta em menos de 1 segundo

- Acessibilidade: O sistema deve ser compativel com leitores de tela e possuir um modo de alto contraste

---

## Requisitos Regras de Negócio(RN)

- Somente o admnistrador pode confirmar o agendamento.

- Somente o admnistrador e médico tem acesso a agenda completa com o nome dos pacientes.

- Os pacientes so terão acesso a horários livres

- O usuário deve estar logado para ter acesso as funcionalidades do sistema
