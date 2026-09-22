# Dora Box Manual

## Features

- Text encryption
- Text decryption
- File encryption
- File decryption
- Time lock
- Password entry supported during encryption and decryption
- Cross-device data synchronization
- Dedicated UI for data input and preview of various formats
- Stablecoin payment
- Local data storage on mobile devices
- Backup mobile local data to cloud archives
- One-click archive health check
- Archive version history
- Soft deletion of archives
- Archive restoration
- Multi-redundant archive backups
- ERC-20 address indexed archives

## FAQs

**Q1: How to ensure sensitive data is not leaked?**

A: You may first apply low-level encryption to sensitive data such as passwords, API keys, private 
keys, mnemonic phrases, etc. Then send the encrypted data to Dora Box for archiving.

**Q2: How to make payments?**

A: Payments can be made using USDT on the Polygon chain.

**Q3: What is a time lock?**

A: The time lock in Dora Box is a data lock that controls the time window during which data is 
visible. Data can only be viewed within the visibility time window defined in the rules.

**Q4: What device types are supported?**

A: Android and iOS versions have been developed. However, only the Android version has been launched for market validation at present, while the iOS version is under parallel development.

**Q5: Is data shared across different platforms?**

A: Yes, because the same cryptographic engine is used at the underlying layer. Data encrypted on Android can be decrypted on iOS, and vice versa.
