# ⚙️ Controladores 8086 no Proteus 8.4

📌 **Este repositório documenta meu aprendizado com os controladores do processador Intel 8086 no Proteus 8.4, utilizando os exemplos prontos desenvolvidos por *Andrew Nelis*.**  

---

## 🔍 Sobre o Projeto
Durante os estudos em **Arquitetura de Computadores II**, estou aprendendo a programar e utilizar  **controladores clássicos** do ecossistema do 8086.  
Para isso, uso o **Proteus 8.4** junto com os controladores já configurados por Andrew Nelis, que servem como base para alterar parâmetros e compreender como cada dispositivo funciona.

---

## 🛠️ Principais Controladores Estudados
✔️ **8251** → Controladora Serial  
✔️ **8253** → Timer/Contador  
✔️ **8255** → Controladora de E/S  
✔️ **8259** → Controladora de Interrupções  

---

## 🎯 Como utilizar no Proteus
1. Abra o **Proteus 8.4**.  
2. Carregue o projeto desejado do Andrew Nelis.  
3. Use a janela de comandos do simulador para interagir com o processador e os controladores.

---

## ⌨️ Comandos úteis no simulador
Ao rodar o programa no Proteus, utilize os seguintes comandos no terminal de entrada:  
- `reset` — reinicializa o controlador para o estado padrão.  
- `cs=1100`— indica o segmento de memória onde o processador vai buscar as instruções para executar.
- `e` — entra em modo de edição para receber o novo padrão.  
- `C: <caminho>` — informa o caminho do executável de debug que será invocado para compilar/aplicar a mudança.
