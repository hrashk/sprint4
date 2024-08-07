# запуск в Chrome

```bash
mvn test
```

# запуск с Firefox

```bash
mvn -Dbrowser=firefox test
```

если mvn test падает с ошибкой 500, и не находит бинарник, то запускаем с параметром

```bash
mvn -Dbrowser=firefox -Dwebdriver.firefox.bin=/usr/bin/firefox test
```

# запуск с Yandex
```bash
mvn -Dbrowser=yandex -Ddriver.version=122.0.6261.94 -Dwebdriver.yandex.bin=/usr/bin/yandex-browser test
```
