# If Your Email Addresses Were All Leaked Tomorrow

— Lessons from an accidental blunder by Japan’s Cabinet Office

Last Tuesday, November 11, Japan’s Cabinet Office released a notice.
It was no policy announcement, no diplomatic statement — just an apology.

Here is what happened. The Cabinet Office commissioned a private platform called Arara to send out electronic newsletters. An operational error exposed the email addresses of more than 60,000 subscribers. The official statement was understated: “Some subscribers’ names, genders, occupations and other personal information may also have been leaked.”

Sixty thousand email addresses, potentially paired with names, gender and occupation.

This was not a hack. No zero‑day exploit. No APT group. No ransomware.
**It was simply human operator error.**

## First, a seemingly unrelated note

Last week Microsoft rolled out two security patches for vulnerabilities in the Windows Encrypting File System (EFS).

One is CVE-2026-83565, an information disclosure flaw — attackers can read sensitive data from EFS‑encrypted files.
The other is CVE-2026-96973, a privilege escalation flaw — attackers may gain elevated access on your system.

Both vulnerabilities are marked “confirmed”, meaning detailed reports and working proof-of-concept exploits exist.

We are talking about the Windows Encrypting File System: the built‑in OS security layer most people assume is secure by default. And it has been found vulnerable.

This is not the first time EFS flaws have surfaced on Windows. Nor will it be the last.

## Putting these two incidents side by side

The Cabinet Office incident tells us: **Even without malicious hacking, an ordinary human mistake can trigger mass data leaks.**
The Windows EFS flaw tells us: **Even when you use native built‑in security features, underlying technical defects can render your protection useless.**

One is a human failure. The other is a technical failure.
Either can go wrong.

Meanwhile, your ID photos, bank card screenshots, scanned contracts and medical reports sit somewhere: on a device, cloud drive or synced folder.

Their safety hinges on two conditions: that everyone handling them never makes a mistake, and that the protecting technology has no vulnerabilities.
**Neither of those is within your control.**

## I once thought I was “secure enough”

To be honest, my understanding of data security used to rest on three assumptions:

**First: having a password.**
Cloud drives have login passwords, phones have screen locks, PCs have boot passwords. I used to think “a password equals safety”.

**Second: turning on encryption.**
Some cloud services advertise “end‑to‑end encryption”; some note‑taking apps claim “military‑grade encryption”. Those buzzwords used to reassure me.

**Third: nothing bad has happened yet.**
I had never been hacked, never lost data, never read news of breaches affecting services I used. I equated “no incident so far” with “no incident ever will happen”.

Every single one of those assumptions is wrong.

Passwords can be phished, cracked via credential stuffing, or leaked by insiders. The decryption keys for so‑called “end‑to‑end encryption” may be held by the service provider. “No breach you know of” is just luck — or the breach has happened without your knowledge.

Those 60,000 Cabinet Office subscribers did not know their information was exposed before the apology was published.

## A question that changed my perspective

A security specialist friend asked me a question last year, one I still remember clearly:
**“If someone took every one of your devices tomorrow — your phone, laptop, hard drives — what could they see?”**

I thought then: they could see my photos, chat logs, emails and files.

He followed up: “What about the things you do not want others to see — contracts, financial records, private correspondence? Are those there too?”

I said yes.

He asked: “Are they encrypted? The kind of encryption where the files stay unopenable even if someone seizes the device and the files?”

I paused and answered: no.

His final line stuck with me: “Then you are effectively exposed.”

## That phrase is harsh, but accurate

We live in an era of extreme data transparency.
Payment platforms know your purchase history. Map apps track your movement. Messaging platforms map your social connections. Smartwatches log your health metrics. Browsers record your search trails.

Most of this you “consented to”, because the services will not work without permission.

But some files are saved by your own choice. You snapped a photo of your ID and stored it on your phone. You uploaded scanned contracts to the cloud for backup. You saved bank statement screenshots just in case.

These are pieces of data you voluntarily placed into the digital world. Their safety depends entirely on where you store them and how you protect them.

If they sit mixed among ordinary files with no extra encryption, they are exposed.

The email, name and occupation data of those 60,000 people from the Cabinet Office leak were exposed — not because of a sophisticated hack, but from one operational slip‑up.
Your files may be waiting for a similar “human error”.

## What does “unopenable” really mean?

It is critical to distinguish between encryption and genuine encryption — a difference most users never learn about.

**Pseudo-encryption:**
Your files are encrypted, but the decryption keys are held by the service provider. Imagine locking your diary in a drawer while leaving the key hanging on the handle. It is locked, yet anyone with access can open it.

Most cloud drives and note apps work this way. They need access to keys to support online preview, full‑text search and AI assistants. Those features cannot run if the provider does not hold keys.

**True encryption:**
Your files are encrypted, and the decryption keys stay only on your devices, never uploaded to servers. The provider stores ciphertext: a stream of random bytes with no readable meaning.

The dividing line is this: **When the provider suffers a breach, gets compromised, or receives legal demands to hand over data, can your files be decrypted?**

With pseudo‑encryption: the provider can decrypt your files, so attackers or third parties can too.
With true encryption: the provider itself cannot unlock your files. No matter what happens, the data remains unintelligible noise.

## DoraBox does just one thing: guarantee they stay unopenable

DoraBox is not a bloated feature‑rich product. It has no AI assistant, no online preview, no smart tagging, no social sharing.

It is simply a box. A container where you place items that only you can unlock.

It follows one core design rule: **Ensure no party, under any circumstance, can access your data — except you.**

Four mechanisms make this possible:

**1. Keys live only on your devices.**
Zero‑knowledge architecture. Encryption keys are generated locally, never leave your device, and are never uploaded to servers. The DoraBox development team does not possess your keys. That means even if the company is acquired, infiltrated, or served with legal orders, no one can decrypt your data.

**2. No plaintext appears anywhere in the full pipeline.**
Data is encrypted on your device before transmission. It travels as ciphertext, stored on servers as ciphertext, and synced to other devices as ciphertext. It is decrypted and rendered only on your authorised devices. From creation to viewing, there is no plaintext stage in transit or at rest.

**3. Post‑quantum‑ready cryptography.**
It currently uses AES‑256‑GCM encryption, paired with Argon2id key derivation and X25519 key encapsulation — the highest civilian cryptographic standard available in 2026.

More importantly, its architecture reserves an upgrade path for post‑quantum algorithms. Security researchers have confirmed an attack strategy known as “Harvest Now, Decrypt Later”: adversaries capture encrypted data today and store it, waiting for mature quantum computing to break the encryption later. DoraBox’s post‑quantum design neutralises that waiting game.

**4. Brute‑force attempts end in key erasure.**
After repeated failed verification attempts, the local encryption key is wiped. The ciphertext remains in place, yet it becomes meaningless noise until you complete the full identity recovery workflow. A brute‑force attack does not crack the safe — it makes the safe’s key disappear.

## Back to the Cabinet Office incident

Sixty thousand email addresses leaked.

What if their account passwords leaked alongside them? What if those mailboxes held contract attachments, bank bills and medical records? What if the stolen details enabled targeted phishing: an email seemingly sent from the Cabinet Office. Would recipients click it?

One misstep can ignite a long chain of harm.
**And the whole chain began with an operator selecting the wrong option while sending newsletters.**

You cannot stop other people from making mistakes. Nor can you guarantee that every technology you rely on stays flaw‑free forever. The only thing within your control is this:
**When something goes wrong, are your most sensitive files unopenable?**

If those affected subscribers had stored their sensitive documents inside DoraBox, even if their email was hacked, passwords were cracked, or devices seized, those files would remain meaningless noise.

Noise cannot be sold. Noise cannot fuel phishing lures. Noise will not trigger that panicked reaction when you see a fake message.
Noise is your protection.

## One thing you can do today

No downloads required. No sign‑ups needed. Spend just two minutes asking yourself:

What data on your phone, computer and cloud drive must never fall into other people’s hands?
ID photos? Bank details? A contract? A private letter? A sensitive image?

Where are they stored right now? Are they inside an encrypted space? And for that encryption — do you hold the keys?

If you cannot answer clearly, it may be time to find somewhere that keeps them unopenable.

This is not because you have something to hide. It is because certain documents simply should not end up in the wrong hands, all because someone else made a mistake.

*DoraBox — Encrypted storage for private data, zero‑knowledge architecture, local key management, full pipeline plaintext‑free, post‑quantum‑ready cryptographic design.*