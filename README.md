# 🚀 Web & API Automation

## **Kepada Mentor**
Dalam tugas Modul 22 ini saya mencoba membuat kembali dari awal namun untuk Test API nya saya menggunakan **Dummyapi.io**
sebagaimana yang ada pada arahan tugas di **Final Project LMS** , dan berikut di bawah ini penjelasan dari Tugas Modul 22 :

Project ini adalah framework automation testing yang menggabungkan pengujian :
**API** (Rest Assured) dan **Web UI** (Selenium) menggunakan **Java**, **Cucumber**, dan **Gradle**.

---

## 🛠️ Tech Stack
* **Language:** Java 17
* **Test Framework:** Cucumber (BDD)
* **API Engine:** Rest Assured
* **Web Engine:** Selenium WebDriver
* **Build Tool:** Gradle
* **Report:** Cucumber HTML Report

---

## 📂 Struktur Project
* `src/test/java/com/refi/api` : Berisi Base API, Step Definitions dan Runner untuk pengujian API.
* `src/test/java/com/refi/web` : Berisi Page Objects, Step Definitions, dan Runner untuk pengujian Web.
* `src/test/resources/features` : File `.feature` (Gherkin) untuk skenario test.

---

## 🚀 Cara Menjalankan Test

### 1. Menjalankan Semua Test (API & Web)
Gunakan perintah ini untuk membersihkan build lama dan menjalankan seluruh suite:
```bash
./gradlew clean test

### 2. Menjalankan Semua API Test
```bash
./gradlew test runApiTests

### 3. Menjalankan Semua API Test
```bash
./gradlew test runWebTests






