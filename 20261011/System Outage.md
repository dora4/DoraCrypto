# System Outage

## —— I panicked again today over putting important stuff on the cloud.

I scrolled across a news story today and froze for a few seconds after reading it.

On October 10, the official IELTS China website released an announcement: due to an unexpected system failure at the UK headquarters, all test centres across mainland China cancelled the exam. Some candidates broke down in tears outside exam halls. With university application deadlines looming, missing this exam may mean they have to defer their application for an entire year.

Someone commented: “How can such a huge organisation’s system just crash out of nowhere?”

Another reply underneath read: “You think it’s the only one?”

That’s exactly right. System crashes do not discriminate based on organisation size.

## A list of “system failures” you may have overlooked

Since the start of 2026, “system malfunctions” have made countless trending headlines:

- **Magnitude 7.6 earthquake in Panama**: On October 10, the capital felt strong tremors, and communications were temporarily cut off.
- **Major Super El Niño event**: The National Climate Centre confirmed it officially formed this September, projected to become the strongest on record since systematic monitoring began. It will peak in late autumn and early winter.
- **Database failure at a courier company**: Parcel tracking information vanished for shipments across multiple cities nationwide, and customer service lines were overwhelmed.
- **Outage on a bank’s mobile app**: Users were unable to make transfers or repay credit card loans in the wee hours, putting their credit records at risk.

Every “system crash” impacts far more than the system itself — it affects everyone relying on that system.

IELTS candidates depend on the examination system. Couriers rely on the logistics system. Bank users trust the financial system.

What system do you rely on to store your critical documents?

## Is there a ticking time bomb inside your phone?

Try this quick check. Unlock your phone and see where these files are stored:

- Front-and-back photos of your ID card → most likely in your photo album
- Screenshot of your bank card number → probably in your photo album or notes app
- Scanned driver’s licence → likely saved in WeChat’s File Transfer Assistant
- PDF medical examination report → sitting in the default folder of some cloud drive
- Crypto wallet seed phrase → stored in your notes app or saved as a screenshot in your photo album

All these files share one key trait: **they are stored in plaintext.**

Photo albums are unencrypted. Notes apps are unencrypted. WeChat’s File Transfer Assistant essentially acts as a relay on Tencent’s servers. Cloud storage — as mentioned before — keeps your files on someone else’s hard drive.

What happens if your phone is lost, stolen or hacked?

No need to answer. You already know.

## What DoraBox does, in one sentence: it gives these files a genuine safe.

Not the kind of safe protected by just a password.

It is a safe redesigned from the ground up using cryptography — one only you can open, remaining secure even if your phone is lost.

To understand what a “genuine safe” means, look at three layers:

### Layer 1: Encryption is the underlying architecture, not an add-on feature.

DoraBox uses the AES‑256 encryption standard. This standard is widely adopted by global financial institutions and military bodies — not because it is trendy, but because brute-force cracking it is physically impossible with current computing power.

Yet the encryption algorithm is only the starting point. Key management matters more. Many “encryption tools” store keys on the service server. That means the provider can decrypt your data. If the provider suffers a breach or is compelled to hand over keys, your “encryption” becomes meaningless.

DoraBox follows a zero-knowledge architecture. Keys are generated locally on your device. They never leave your device and are never uploaded to servers. Even the DoraBox team cannot decrypt your data. It is not a promise of “we won’t look”; technically, it cannot be done.

### Layer 2: Biometric authentication is a shortcut, not your sole security reliance.

DoraBox supports fingerprint and facial recognition as quick access methods. However, biometric data stays locally on your device and never passes through third-party servers.

DoraBox also features a **decoy vault**. You may set a decoy password. Entering it opens a fake vault filled with trivial, unimportant files.

When would this help? Imagine an extreme scenario: someone forces you to unlock your phone. You can open the decoy vault to comply, while your real vault contents stay protected. Is this scenario unlikely? Yes. But what if it happens?

### Layer 3: Local-first design with encrypted sync.

Your data resides primarily on your device. If cross-device sync is needed, data is encrypted locally before transmission. Data travels over a TLS 1.3 encrypted channel and remains ciphertext once it reaches the target device; decryption only occurs on authorised devices.

End-to-end encryption across the whole pipeline, with no plaintext exposure window.

## What should you put inside?

Everyone will have a different list. A simple rule if you are unsure whether a file belongs here:
**Would your life be disrupted if a stranger saw this file?**

If the answer is yes — store it here.

Common categories that are no-brainers:

- Identity documents: ID card, passport, driving licence, household register, property deed
- Financial records: bank account details, insurance policies, investment records, tax documents
- Medical files: health check reports, medical history, prescriptions, genetic test results
- Secret keys: various passwords, crypto wallet seed phrases, API keys, 2FA backup codes
- Private documents: journals, letters, contracts, legal papers

This is not about hiding things.

It is about giving important documents the secure place they deserve.

You would not leave your property deed on the living room coffee table; you put it in a safe or deep inside a drawer. Same logic applies to your phone. Your most sensitive files should not sit alongside screenshots of takeaway orders.

## After the IELTS system crash

A top-voted comment under the news read: “Never store important things in only one place from now on.”

That is true. But multiple copies alone are not enough. More importantly: **every single storage location must be secure.**

Saving three plaintext copies across three different cloud drives is not backup — it triples your risk.

The correct approach: encrypt before backing up. Keep encryption keys solely in your possession. Every backup copy is ciphertext. Even if the storage provider experiences an outage or breach, your data remains safe.

That is exactly what DoraBox delivers.

It does not merely host your data — it keeps your data securely stored. The distinction is huge.

>
> Your critical files deserve a genuine safe, not just a locked drawer.