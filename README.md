# 🚀 Web & API Automation FINAL PROJECT JayJay

## **DESKRIPSI**

Project ini adalah framework automation testing yang menggabungkan pengujian :
**API** (Rest Assured) dan **Web UI** (Selenium) menggunakan **Java**, **Cucumber**, dan **Gradle**.

---
## Target Pengujian  

* **WEB Automation UI =**  https://www.saucedemo.com/
* **API =** https://dummyapi.io/

---

## 🛠️ Tech Stack
* **Language:** Java 17
* **Test Framework:** Cucumber (BDD)
* **API Engine:** Rest Assured
* **Web Engine:** Selenium WebDriver
* **Build Tool:** Gradle
* **Report:** Cucumber HTML Report, Allure Report

---

## 📂 Struktur Project
* `src/test/java/com/refi/api` : Berisi Base API, Step Definitions dan Runner untuk pengujian API.
* `src/test/java/com/refi/web` : Berisi Page Objects, Step Definitions, dan Runner untuk pengujian Web.
* `src/test/resources/features` : File `.feature` (Gherkin) untuk skenario test.

---
## Skenario Pengujian 
### WEB Automation
Pengujian yang dilakukan mencakup :

* Login dengan valid data
* Login dengan Invalid data (Negative)
* Fungsi button add to cart
* Fungsi button delete form cart
* Fungsi button continue shopping
* End2End dari login hingga checkout berhasil 

### API 
Pengujian yang dilakukan mencakup :
* Get List User
* Create User
* Get User ID
* Update User
* Delete User
* Delete User Invalid ID (negative)

---

## 🚀 Cara Menjalankan Test

### 1. Menjalankan Semua Test (API & Web)
Gunakan perintah ini untuk membersihkan build lama dan menjalankan seluruh suite:

./gradlew clean test  

### 2. Menjalankan API test saja 
Gunakan perintah ini :
./gradlew runAPiTests

### 3. Menjalankan WEB Test saja
Gunakan perintah ini :
./gradlew runWebTests  


## REPORT
Project ini menggunakan Cucumber HTML Report, Cucumber JSON Report dan 
Allure Report

Setelah test dijalankan, report dapat dilihat pada =
* API test = target/cucumber-report-api.html dan target/cucumber-report-api.json
* WEB test = target/cucumber-report-web.html dan target/cucumber-report-web.json
* Allure = build/allure-results

untuk membuka allure di browser  
jalankan perintah = allure serve build/allure-results


## PENUTUP
Project ini dilakukan dengan harapan dapat memenuhi FINAL PROJECT yang ditugaskan oleh JayJay, 
juga sebagai Portofolio Automation Testing saya.
