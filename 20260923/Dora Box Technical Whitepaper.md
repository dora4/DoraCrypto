# Dora Box Technical White Paper

## Overview of Privacy Data Encrypted Storage Solution

Version: September 2026 · For Technical Decision-Makers and Security-Aware Users

## 1. Problem Statement

### 1.1 Current Data Breach Landscape

The data security landscape remains severe in 2026. Bitsight’s annual tracking report shows that global data breach incidents continue at a high level. The telecommunications industry alone recorded more than 32 large-scale breaches, involving advanced persistent threat (APT) actors such as Salt Typhoon.

In September of the same year, the "Hu-Wang 2026" special campaign launched by Jiangsu Provincial Public Security Department released five typical cases. One case involved an operation and maintenance company failing to encrypt stored data and illegally deploying remote tools, enabling remote downloads of data. Such cases demonstrate that unencrypted storage represents the biggest risk exposure in current data breaches.

### 1.2 Limitations of Traditional Solutions

表格

| Solution                      | Core Drawbacks                                               |
| ----------------------------- | ------------------------------------------------------------ |
| Ordinary cloud drives         | Plaintext storage on the server side; service providers can directly access user data |
| Encrypted cloud drives        | Encryption keys are hosted on the server; service providers still possess decryption capabilities |
| Local encryption tools        | Users must manage keys on their own; high operational complexity. Lost keys equal lost data |
| Hardware encrypted USB drives | Physical media prone to loss and damage; cross-device access unavailable |

## 2. Dora Box Design Principles

The architecture of Dora Box follows four design principles below:

### 2.1 Client-Side Encryption First

All encryption and decryption operations are performed locally on the user’s device. Data is encrypted before leaving the user’s device and remains ciphertext during transmission and server-side storage. The server never touches plaintext data and never holds decryption keys.

### 2.2 Zero-Knowledge Architecture

The Dora Box server cannot decrypt any user-stored content. Even if the server is compromised, attackers can only obtain indecipherable ciphertext. This architectural feature fundamentally eliminates the risk of the service provider becoming a single point of failure.

### 2.3 User-Controlled Keys

Encryption keys are generated and stored locally by users. Dora Box does **not** offer a password recovery feature — this is a deliberate design choice, not a product defect. In a zero-knowledge system, if the service provider can recover your password, it means the provider can access your data.

### 2.4 Balance Between Usability and Security

While maintaining the zero-knowledge architecture, Dora Box optimizes user experience through the following mechanisms:

- Local key backup export (exported as an encrypted file for user safekeeping)
- Biometric unlock (fingerprint / facial recognition to unlock the local key vault)
- Cross-device synchronization (encrypted data synchronized across multiple devices; keys transmitted independently over a secure channel)

## 3. Benchmarking Against Industry Standards

In September 2026, the EU Cyber Resilience Act officially took effect, requiring connected products to report security incidents within 24 hours. In the same month, the National Cybersecurity Awareness Week released the *AI Security Governance Framework 3.0*, highlighting the core logic of "risk classification, technical response, and comprehensive governance".

Within this regulatory environment, Dora Box’s zero-knowledge architecture delivers inherent compliance advantages:

表格

| Regulatory Requirement           | Dora Box Response                                            |
| -------------------------------- | ------------------------------------------------------------ |
| Data breach reporting obligation | Server holds no plaintext data, minimizing breach impact scope |
| Data minimization principle      | Only ciphertext stored; no collection of user content information |
| User data portability            | Encrypted files exportable in standard formats; keys usable across platforms |
| AI governance compliance         | No user plaintext data available for AI analysis or model training |

## 4. Applicable Scenarios

Dora Box serves the following typical use cases:

**Individual Users**

- Secure storage of high-sensitivity documents: ID cards, passports, driver’s licenses
- Privacy protection for medical records and physical examination reports
- Encrypted archiving of financial documents and original contracts
- Secure storage of password notes and mnemonic phrases

**Professionals**

- Client document protection for lawyers
- Patient medical record management for physicians
- Source material protection for journalists
- Safekeeping of unpublished research findings for researchers

**Small Teams**

- Controlled sharing of business plans
- Encrypted archiving of financial data
- Protective storage of core intellectual property

## 5. Frank Remarks on "Inconvenience"

Dora Box intentionally incorporates certain "inconvenient" design tradeoffs:

- No password recovery function — any password recovery mechanism enables service providers to access your data
- No online preview of ciphertext — online preview requires server-side decryption, violating the zero-knowledge principle
- Extra key transfer steps for cross-device use — keys cannot be relayed via the server

These inconveniences are the cost of security. Much like a security front door is more cumbersome to open than an ordinary door — that extra effort is where your sense of safety comes from.

## 6. Conclusion

In 2026, an era where data breaches have become commonplace and AI analytical capabilities grow exponentially, encrypted storage has evolved from a niche demand for tech enthusiasts into a fundamental tool and right for every digital citizen.

Dora Box does not aim to make security "completely invisible". Instead, it upholds a clear covenant: your data belongs solely to you, and we enforce this reality through technical means.

> Dora Box — Privacy Data Encrypted Storage, Zero-Knowledge Architecture. Your keys, yours alone.