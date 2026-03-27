# 📌 Post Card With Jetpack Compose (Foundation)

A simple **Post Card UI** built using **Jetpack Compose Foundation**.  
This project demonstrates how to build a modern social media post layout using Compose components such as:

- `Column`
- `Row`
- `Image`
- `BasicText`
- `Modifier`
- `RoundedCornerShape`

---

## ✨ Features

✅ Clean Post Card Design  
✅ Profile Avatar with Rounded Corners  
✅ Username + Timestamp Header  
✅ Post Caption Text  
✅ Post Image with Proper Scaling  
✅ Responsive Layout (`fillMaxWidth`)  
✅ Smooth UI with Material 3 Card Styling  

---

## 🖼️ Preview

### Card Preview (Compose Preview)
<img width="458" height="733" alt="Card Preview" src="https://github.com/user-attachments/assets/1105fd91-7254-414f-ac88-6d9c1c117bff" />

---

### Card Screen (Real Device)
<img width="1280" height="2856" alt="Card Screen" src="https://github.com/user-attachments/assets/65a4549e-36a3-469a-8f31-2f99a14c9985" />

---

## 🛠️ Tech Stack

- **Kotlin**
- **Jetpack Compose**
- **Compose Foundation**
- **Android Studio**

---

## 📌 Key UI Concepts

### 🔥 Image Scaling Problem Fix

When using `fillMaxWidth()` with images, the height may become too large depending on the image ratio.

To solve this, the post image uses:
- `aspectRatio()`
- `ContentScale.Crop`

This ensures the post remains visually consistent and does not break the layout.
