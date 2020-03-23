## Selenium-maven project

### web element locators as an example
```
By.id
Syntax: driver.findElement(By.id(“xxx”));
By.name
Syntax: driver.findElement(By.name(“xxx”));
By.className
Syntax: driver.findElement(By.className(“xxx”));
By.tagName
Syntax: driver.findElement(By.tagName(“xxx”));
By.linkText
Syntax: driver.findElement(By.linkText(“xxx”));
By.partialLinkText
Syntax: driver.findElement(By.partialLinkText(“xxx”));
By.css
Syntax: driver.findElement(By.css(“xxx”));
By.xpath
Syntax: driver.findElement(By.xpath(“xxx”));
```
### Automate the following Test case

#### Steps

1. Launch https://www.google.com/ page on chrome browser 
2. Add a text called "Selenium Tutorial" on google search field 
3. Search the text from google search engine
4. Verify the result 
