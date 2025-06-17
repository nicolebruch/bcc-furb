# 🖥️ Simulador M++ e Compilador Assembly

📌 **Este repositório contém o simulador de circuitos digitais e o compilador Assembly (M++) desenvolvidos por um aluno do professor Miguel.**
O simulador é utilizado como **ferramenta de apoio didático** nas aulas, permitindo testar códigos Assembly e circuitos digitais de forma simples.

---

## 🔧 Sobre o Projeto

Este projeto foi desenvolvido por **um aluno do professor Miguel** como parte de um trabalho acadêmico.
Atualmente, é usado como ferramenta de simulação nas atividades de aprendizado de:

* Arquitetura de Computadores
* Lógica Digital
* Programação Assembly (M++)

O ambiente é composto por:

* ✅ **Compilador Assembly (M++)**
  Transforma arquivos `.mmf` (Assembly) em arquivos `.mmp` (imagem de memória) que são carregados no simulador.

* ✅ **Simulador de Circuitos (baseado no Logisim)**
  Permite montar e testar circuitos digitais, incluindo processadores desenvolvidos dentro do próprio simulador. Suporte a carregamento de imagens de memória geradas pelo compilador.

---

## 🚀 Como Usar no Linux

### ✔️ **Requisitos**

* Ter o **Java instalado**. Se não tiver, instale com:

```bash
sudo apt install default-jre
```

---

### 🛠️ **Compilar o Código Assembly**

1. No terminal, execute o compilador:

```bash
java -jar CompiladorAssembly.jar
```

2. O compilador irá gerar um arquivo com extensão `.mmp`, convertido a partir do arquivo `.mmf`.

---

### 🖥️ **Abrir o Circuito no Simulador**

1. Execute o simulador gráfico (baseado no Logisim):

```bash
java -jar logisim-generic-2.7.1.jar
```

2. Na interface do simulador:

   * Abra seu circuito.
   * Clique na memória (ROM ou RAM).
   * **Substitua o arquivo antigo pelo novo arquivo `.mmp`** gerado na compilação.
   * Pressione o botão de **reset** no circuito para carregar a nova imagem de memória.

---

### ▶️ **Iniciar e Pausar a Simulação**

* Use o atalho **`Ctrl + K`** para **iniciar ou pausar** a execução do circuito.

---

## ⚙️ Observações Importantes

* Sempre que alterar o código Assembly, é necessário recompilar e atualizar a imagem no simulador.
* Este simulador foi desenvolvido por um aluno do professor Miguel, com finalidade **exclusivamente educacional**.
* É uma ferramenta utilizada pelo professor Miguel nas aulas como apoio para ensino de lógica digital e arquitetura.
