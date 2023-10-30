## Running from the command line

Use git bash if running on Windows

```bash
mvn -Dwebdriver.chrome.driver=/opt/chromedriver/chromedriver \
    -Dwebdriver.chrome.binary=/opt/chrome-for-testing/chrome \
    -Dwebdriver.yandex.driver=/opt/chromedriver/chromedriver-116 \
    -Dwebdriver.yandex.binary=/usr/bin/yandex-browser \
    -Dbrowser=yandex test
```
