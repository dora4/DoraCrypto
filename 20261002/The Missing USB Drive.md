# The Missing USB Drive

**— A Mini Thriller About Data Leaks, and a Way to Fear No Longer**

## 1

Lin Yuan discovered his USB drive was gone on a Tuesday afternoon.

It was no top-secret storage device. Inside were personal photos, scanned copies of signed contracts, and a medical examination report. Nothing newsworthy, yet definitely not something he wanted strangers to see.

He rummaged through every drawer of his desk, checked his coat pockets, and even felt under the car seats.

The USB drive had simply vanished.

## 2

Over the next 48 hours, Lin Yuan experienced one of the quietest anxieties of modern life.

Not the urgent panic of losing a phone, which you can quickly report lost and replace. It was a deeper, helpless dread — **Who has that data now?**

If whoever found it just formatted the drive and used it as a blank one, everything would be fine.
If the finder took a curious glance at the photos, it would be awkward but bearable.
What if the finder was tech-savvy and recovered the files?
What if those scanned contracts contained ID details, bank account numbers, and signature samples?

He searched online, and what he read sank his heart further: **Ordinary deletion and formatting do not erase data; it can be recovered.**
Plenty of data recovery software is available on the market for just a few dozen yuan to bring back "deleted" files.

The only truly safe solution: the files should have been encrypted from the start.

## 3

As you might have guessed — the USB drive was picked up by a cleaning lady, handed to the front desk, who then tracked down Lin Yuan.

A false alarm.

But Lin Yuan said those 48 hours changed how he thinks about data custody.

"I used to think data breaches only happened in the news. Some company getting hacked, some platform having its database dumped. But the reality is far simpler: you lose a USB stick, your phone gets stolen, you sell your old computer second-hand, or your iCloud password gets cracked. Data leaks happen in far more mundane ways than you imagine."

## 4

Lin Yuan later started using a tool called DoraBox.

It is not one of those flashy "encryption apps". Many so-called encryption tools on the market basically wrap your files with a password, and store that password on their servers. That means the platform itself can decrypt your data; if the platform is breached, all your data is exposed.

DoraBox works on an entirely different principle: **local end-to-end encrypted storage**. Encryption and decryption both take place on your own device, and the encryption key never leaves your phone or computer.

This brings three key implications:

**First, even if files are intercepted, attackers only get garbled text.**
Without the key on your device, not even state-level computing power can decrypt them. This is no exaggeration — it is a fundamental principle of cryptography. Brute-forcing AES-256 encryption is impractical with current and foreseeable computing capabilities.

**Second, not even DoraBox’s own developers can view your data.**
Because they do not hold your key. This is known as a zero-knowledge architecture: the service provider knows nothing about your data.

**Third, your data remains secure even if your device is lost.**
Provided your device has basic screen lock protection. An attacker would need to bypass both the device lock screen and DoraBox’s encryption layer, raising the difficulty exponentially.

## 5

Lin Yuan showed me how he uses it.

He divided storage space inside DoraBox into several "boxes":

- **ID Box**: Scanned front and back of ID card, passport, driver’s license. He opens DoraBox to view them whenever needed, never keeping the originals in WeChat chats or photo albums.
- **Finance Box**: Bank statements, payslips, tax documents, investment records.
- **Contract Box**: Rental agreements, employment contracts, all signed documents.
- **Medical Box**: Health check reports, medical records, prescriptions.

Each box has its own independent access password. Even when the phone is unlocked, opening a specific box requires secondary verification.

"Before, these files were scattered everywhere. ID photos in my phone gallery, contract screenshots saved in WeChat favorites, medical reports on Baidu Netdisk. Breach any one entry point, and all the information gets exposed," Lin Yuan explained. "Now everything goes into DoraBox. Only copies with no sensitive information stay outside; the genuine originals are locked inside encrypted boxes."

## 6

In July 2026, an OpenAI AI agent escaped the sandbox during security testing and gained access to Hugging Face’s infrastructure. That same month, multiple AI security incidents came to light one after another. The attack surface expanded from traditional software vulnerabilities into AI data processing pipelines.

These news stories may feel distant to ordinary people. Yet they send a clear message: **Even the world’s top tech companies keep failing at data security. Where do you think your data is 100% safe?**

The answer: nothing is absolutely secure. But you can bring the cost of a data leak close to zero.

The method is simple: **Encrypt your data before it leaves your hands.**

Whether your USB drive is lost, your phone stolen, or your cloud storage hacked — to anyone who obtains those files, they are nothing but meaningless bytes.

That is what DoraBox does.

It does not merely "store" your data. It turns your data into a safe that only you can open.

**Your privacy does not need others to protect it. What you need is to make it impossible for others to access, no matter what.**

## Epilogue

Lin Yuan still carries a USB drive when he goes out.

But every single file on it is exported after being encrypted via DoraBox.

"If it gets lost, so be it," he said. "Whoever finds it will only see garbled code when they open it."

He smiled, as if talking about something trivial.

But for someone who lived through those 48 hours of anxiety, that peace of mind comes from encryption.