TRIGONOMETRY PRO V13.2.3 — ANDROID APK PROJECT

โปรเจกต์ Android wrapper สำหรับเปิดโปรแกรม TRIGONOMETRY PRO จากไฟล์ภายในเครื่อง
มีไอคอนแอปและหน้าต่าง WebView แบบ standalone

ข้อสำคัญ:
- ไฟล์นี้เป็นซอร์สโปรเจกต์ Android พร้อม workflow สำหรับ build APK บน GitHub Actions
- ยังไม่ใช่ไฟล์ APK ที่ติดตั้งได้ เพราะสภาพแวดล้อมที่สร้างไฟล์นี้ไม่มี Android SDK / Android Gradle Plugin / Gradle
- วิธีสร้าง APK: อัปโหลดโฟลเดอร์ทั้งหมดขึ้น GitHub repository, เปิดแท็บ Actions, เลือก workflow "Build TRIGONOMETRY PRO APK" แล้วกด Run workflow
- เมื่อ workflow สำเร็จ ให้ดาวน์โหลด artifact ชื่อ TRIGONOMETRY-PRO-V13.2.3-APK และนำ app-debug.apk ไปติดตั้งบน Android
- APK แบบ debug เหมาะสำหรับทดสอบส่วนตัว ยังไม่ใช่ release APK ที่ลงนามสำหรับเผยแพร่ใน Play Store

แอปเปิดเนื้อหาแบบ offline จาก app/src/main/assets/www/index.html
