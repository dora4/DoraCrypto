# Microsoft just got another security hole punched in it. Are your files still hanging on that wall?

**——From the Windows EFS vulnerability to the Supreme People’s Procuratorate guiding cases: Why “platform encryption” is not the same as “your encryption”**

In the first week of November, Microsoft quietly patched a vulnerability.
CVE-2026-83784. It sounds technical, but the impact is straightforward: **the Windows Encrypting File System (EFS) suffers from a privilege escalation vulnerability.**
Attackers can escalate privileges on your computer, bypass EFS encryption protection, and directly read your “encrypted” files.

EFS is no niche feature. It is Windows’ built-in file encryption system, dating back to Windows 2000. Countless businesses and individual users rely on it to encrypt local files — right-click a folder, check “Encrypt contents to secure data”, and the file icon turns green, making it look secure.

**But this vulnerability drives home one point: that “security” is granted by the platform. And the platform can take it away.**

## Two other incidents that happened the same week

Around the time Microsoft patched CVE-2026-83784:
**The Supreme People’s Procuratorate released eight guiding cases on the lawful protection of citizens’ personal information.**
One case involved doxxing and online harassment — attackers illegally obtained personal information to pinpoint victims and launch cyber abuse. Another specifically targeted crimes against the elderly exploiting their limited digital literacy, with strict punishment in accordance with the law.

**The Beijing Communications Administration issued its 11th round of App notifications for 2026.**
Eight apps were publicly named for “collecting personal information in violation of the necessity principle” and ordered to rectify within a deadline. More apps had been cited for the same issue the previous month.

These three events may seem unrelated. Taken together, however, they draw a clear picture:
**Vulnerabilities expose the fragility of platform encryption. The cases reveal the real harm once data is abused. The notices show regulators are racing to catch up — yet they can never outrun attackers.**

## The EFS story epitomizes all “platform encryption”

EFS’s encryption algorithm itself is sound, using mature cryptography. The problem lies in **who controls the encryption process.**

EFS encryption keys are managed by the operating system, which is developed by Microsoft. Microsoft patched the flaw, but until patches are applied — the window between public disclosure and installation — attackers can leverage privilege escalation to bypass encryption.

This is not unique to EFS. **All platform-managed encryption systems share the same structural risk:**
The encryption keys are not in your possession. They belong to the platform.
If the platform is compromised, keys are exposed. If the platform has a vulnerability, encryption can be bypassed. If the platform receives a legal demand for cooperation, keys may be legally handed over. If platform staff have access privileges, keys may be misused by insiders.

**You trust the platform. But no platform is unbreakable.**

This follows the same logic as the procuratorate cases. Personal information gets leaked, traded, and weaponized for crime for one fundamental reason: **the data is stored by a third party, and that third party fails (or cannot guarantee) sufficient protection.**

## Two types of encryption, two different worlds

The security industry divides encryption into two categories:
**Platform-Managed Encryption.**
Encryption keys are generated, stored and managed by the service provider or platform. You hand your files to the platform, which handles encryption and decryption. The “encrypted” status you see simply means “the platform encrypted it for you”.

Pros: Easy to use. Password recovery is available, seamless migration across devices, and flexible authorization for team collaboration.
Cons: The platform becomes a single point of failure. A platform breach means encryption fails for all users. A platform vulnerability exposes everyone’s files. EFS falls into this category.

**User-Held Key Encryption / Zero-Knowledge Encryption.**
Encryption keys are generated locally on your device and never uploaded to servers. The platform only stores ciphertext, with no access to keys. You manage your own keys.

Pros: Even if the platform is fully compromised, attackers only get ciphertext. Without the key, ciphertext is meaningless garbage.
Cons: You must safeguard your keys. Lose the key, lose your data. There is no “forgot password” recovery route.

**EFS belongs to the first category. DoraBox belongs to the second.**

## DoraBox’s four lines of defense

DoraBox does not trust any platform — not even its own. Its design philosophy: **Assume the platform has already been breached, then make sure your data stays safe.**

To achieve this, it builds four lines of defense:

### 1. Zero-knowledge key architecture

Keys are generated on your device, never leave it, and are never uploaded to servers. The DoraBox development team does not hold your keys. Even if the team is subpoenaed, hacked, or betrayed by insiders, they cannot surrender your keys — because they never have them.

This is a fundamental difference from EFS. EFS keys reside inside Windows, and CVE-2026-83784 lets attackers gain elevated access to retrieve them. DoraBox keys stay on your local device; no keys exist on the server for attackers to steal.

### 2. No plaintext exposure across the entire pipeline

From creation to viewing, your data exists as plaintext only on your authorized devices. It is ciphertext in transit, ciphertext on the server, and remains ciphertext after syncing to other devices — decrypted for display only on authorized hardware.

There is no “plaintext transfer hub”. Any interception by attackers at the transport, storage or sync layer yields only ciphertext.

### 3. AES-256-GCM encryption with post-quantum readiness

It currently uses AES-256-GCM, paired with Argon2id key derivation and X25519 key encapsulation — the top civilian cryptographic standard as of 2026.

More importantly, it supports post-quantum migration. The security community has confirmed the “Harvest Now, Decrypt Later” attack strategy: attackers steal encrypted data now and store it, waiting for quantum computing to break it later. DoraBox’s architecture reserves an upgrade path for post-quantum algorithms, ensuring data stored today remains secure a decade from now.

### 4. Self-destruct mechanism

After repeated failed verification attempts, the local key will be erased. Your ciphertext remains, but it is just unintelligible data until you complete the full identity recovery process.

Brute force attacks do not end with “opening the safe”; they end with the safe’s lock vanishing.

## Back to that Windows vulnerability

CVE-2026-83784 has been patched. But what about the next one?
Microsoft patches thousands of vulnerabilities every year. Windows is far from the only vulnerable platform — macOS, Linux, iOS and Android all have flaws. Every operating system and app you use may contain vulnerabilities.

**As long as your encryption depends on a platform, a flaw in that platform is a flaw in your encryption.**

This is not criticism of any single platform. It is an inherent structural issue. Platforms must manage keys to provide decryption services, and key management itself creates an attack surface.

DoraBox bypasses this structural problem. It keeps the platform out of key management. Keys stay with you; ciphertext sits on the platform. A platform vulnerability? It only exposes ciphertext, which is useless without the key.

**The EFS lesson: “The platform says it’s encrypted” does not equal “your data is secure”.**
**What sets DoraBox apart: encryption is something only you know, only you control, and only you can unlock, from start to finish.**

## Takeaway from the procuratorate cases

One detail from those guiding cases deserves attention:
Criminals obtain personal information in countless ways — buying it from insiders, scraping it via platform vulnerabilities, bribing staff, or stealing it with technical tools. Yet all these methods share one thing: **the data exists on third-party systems in plaintext (or platform-encrypted) form.**

What if the data was encrypted with user-held keys from the very beginning?
A corrupt insider cannot hand over plaintext — only ciphertext exists on the system. Data scraped through platform flaws is ciphertext, unreadable without keys. Compromised staff can only surrender ciphertext, since keys never reside on the server.

**Client-side encryption from the source is the most effective countermeasure against data crime.**
Not because it makes data harder to steal, but because stolen data becomes worthless.

## A quick judgment you can make right now

Check which files on your computer and phone are protected by “platform encryption”:
Folders encrypted with Windows EFS — keys held by Windows. iCloud encrypted photos — keys held by Apple. WeChat chat logs — keys held by Tencent. The “encrypted vault” on some cloud drive — keys held by the cloud provider.

Are these forms of “encryption” useless? No. They keep out casual thieves.
But they cannot defend against platform-level vulnerabilities, insider abuse, or legally compelled key disclosure.

**For truly sensitive files — ID documents, banking records, contracts, medical records — you need encryption that stays safe even when the platform is breached.**

That is what DoraBox is built for.

It is not that EFS is bad. It is simply that in 2026, the phrase “the platform encrypted it for you” is no longer enough.

*DoraBox — Privacy-first encrypted storage, zero-knowledge architecture, local key management, zero plaintext exposure end-to-end, post-quantum-ready encryption design.*