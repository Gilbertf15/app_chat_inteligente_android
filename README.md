# 📱 Chat Inteligente Android com LLM

Um aplicativo Android de chat inteligente que utiliza _Modelos de Linguagem de Grande Escala (LLM)_ para responder perguntas, gerar texto e auxiliar usuários em tempo real.

## 🚀 Funcionalidades

- 🤖 Chat em linguagem natural com respostas contextuais.
- 🌐 Integração com API de LLM da Groq.
- 🎨 Interface construída em _XML_ para Android.

## 🛠 Tecnologias Utilizadas

- _Java_ – Linguagem principal para desenvolvimento Android.
- _Android Studio_ – IDE para desenvolvimento.
- _LLM API_ - Groq: llama3-70b-8192
- _HttpURLConnection_ – Para requisições HTTP.
- _XML (Layouts)_ – Para UI.

## 📂 Estrutura do Projeto

```bash
chat-inteligente-android/
│── app/
│   ├── src/main/
│   │   ├── java/com/example/chatbot/
│   │   │   ├── RequestApiGroq.java    # classe de requisição da API externa
│   │   │   └── MainActivity.java # classe Main da aplicação
│   │   └── res/
│   │       ├── layout/     # Arquivos XML da interface
│   │       ├── values/     # Strings, cores, estilos
│   │       └── drawable/   # Ícones, fundos, shapes
│   │       └── xml/
│   │       └── values-night/
│   │   └── AndroidManifest.xml
│   └── build.gradle
│── grandle/
│── .idea/
│── .gitignore
│── LICENSA
│── build.grandle.kts
│── grandle.properties
│── grandlew
│── grandlew.bat
│── settings.grandle.kts
└── README.md
```

### Clone este repositório

```bash
git clone https://github.com/seuusuario/chat-inteligente-android.git

```

## 📄 Licença

Este projeto está licenciado sob a MIT License.
Você pode visualizar os detalhes completos no arquivo LICENSE.
