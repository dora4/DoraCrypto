# What Happens to Your Files After a Cloud Platform Suffers Internal Credential Leaks

## — The Zeabur Incident and the Fragility of Cloud Trust, Plus a Trustless Storage Alternative

---

### What Unfolded in the Early Hours of October 14

Between October 14 and 15, 2026, cloud platform Zeabur suffered a security breach.

Attackers used leaked internal Zeabur credentials to breach shared clusters and some dedicated clusters. Zeabur released an initial advisory on October 18 with cautious wording — the very phrase “initial report” signalled that the full impact was still being assessed.

The most notable detail here is not how sophisticated the attackers were, but their entry point: **leaked internal credentials**.

It was not a zero-day exploit, not a social engineering scam, and not supply-chain poisoning. Simply put, credentials belonging to someone — an engineer, an operations staff member, or even a former employee — ended up in the wrong hands.

Once attackers obtained those internal credentials, they saw exactly what an authorised staff member would see. Every file, every dataset, every piece of user stored content — all visible in plaintext.

This is not a problem unique to Zeabur. It is an inherent structural risk for every cloud platform that stores user files on servers as plaintext.

---

### The Lock You Trust: Does It Secure the Door, or the Whole Room?

Most people use cloud drives like this: set a login password, upload files, and assume their files are “safe”.

This model rests on a hidden assumption: **the platform itself is trustworthy**.
You trust that platform engineers will not peek at your files, that operations teams will not leak your data, and that the platform’s internal systems will never be compromised.

Yet the Zeabur incident proves this assumption is technically unsound.

When internal credentials leak, attackers gain the same access rights as platform employees. And what can platform employees do? They can access every file you upload — because those files sit on servers in plaintext. The so-called “security” relies on nothing more than a door lock. If the lock key gets copied, everything inside the room is exposed.

**The issue is not whether the lock is strong enough. The issue is that the contents inside should never have been left out in the open from the start.**

---

### What If Your Files Put On Armour Before Uploading?

DoraCloud is built on a fundamental design split from conventional cloud storage:

**Traditional cloud drive:** File → Upload → Server stores plaintext → Access protected by login password
**DoraCloud:** File → Encrypted locally on your device → Ciphertext uploaded → Server stores only ciphertext

The difference lies in **the form your files take on the server**.

On traditional cloud storage, your files are readable. The platform holds the decryption keys; it can decrypt your data, and so can anyone who gains platform-level access.

On DoraCloud, your files are unreadable on the server. Encryption runs locally on your device, and decryption keys stay only on your device. DoraCloud servers hold nothing but encrypted ciphertext. Even if an attacker gets hold of DoraCloud’s internal credentials, just as in the Zeabur breach, all they will find is unintelligible encrypted data.

**This is what zero-knowledge storage means: the platform is technically incapable of accessing your data. It is not a promise that they will not look; it is that they cannot, even if they wanted to.**

---

### Partitioned Storage: Smooth Performance for 95% of Files, Maximum Security for 5%

DoraCloud has an underrated yet highly practical feature: **storage partitioning**.

It divides your storage space into two zones:

**General Files Zone** — Daily photos, documents, videos, work materials. This zone uses a high-speed sync channel with real-time cross-device sync, matching the experience of mainstream cloud drives. Data is encrypted in transit, but end-to-end encryption is disabled here to maintain smooth performance.

**Private Data Zone** — ID scans, contracts, financial records, password notes. This zone uses an end-to-end encrypted channel; keys remain local to your devices. Access requires secondary verification, with more conservative sync rules.

Why separate them? It comes down to a counterintuitive but well-documented principle in security psychology:
**If you force everything to be encrypted, the extra friction will gradually make you abandon encryption entirely — which is the most dangerous outcome of all.**

DoraCloud takes a pragmatic approach: keep your 95% of everyday files easy to use, while reserving top-tier protection for the 5% of sensitive data. Each serves its purpose without getting in the way of the other.

It is like organising things at home: you would not lock every pair of socks in a safe, nor leave your property deed lying casually on the coffee table. Ordinary drawers and safes each have their place; the key is putting things where they belong.

---

### Internal Credential Leaks Will Not Go Away — But You Can Make Them Harmless

Zeabur is neither the first nor the last breach caused by leaked internal credentials.

In October 2026, Danish IT firm Pays ApS exposed 8.8 million citizen records after an administrator used “123456” as a password. That same month, Capcom’s CAPCOM ID system suffered unauthorised access, leaking 11.7 million account records.

These incidents share one core trait: **attackers did not need to crack encryption. They only needed to obtain “legitimate” access permissions.**
Under traditional architectures, legitimate access equals plaintext access.

DoraCloud’s core mission is simple: **break the link between “having legitimate access” and “being able to read the content”.**
Whether internal credentials leak, servers are breached, or operations staff hold root privileges — all they can see is ciphertext. The decryption key never leaves your device.

This is not some abstract security ideal. It is a practical, deployable engineering solution built for everyday users.

---

### One Quick Check You Can Do Right Now

Open the cloud storage service you are using and ask yourself:

**“If an internal staff member of this platform could view my files, which ones would I be comfortable with them seeing?”**

If your answer is “most are fine, but some must never be seen” — where are those sensitive files right now?

If they are mixed together with ordinary files in the same cloud folder with no extra encryption, they carry exactly the same risk exposure as all user files in the Zeabur breach.

This is not meant to spark panic. It is to show you that **there exists a storage model where you do not need to trust any person — only mathematics.**

---

*DoraCloud — Partitioned storage for private and general files, client-side end-to-end encryption, no decryption keys held by the platform, zero-knowledge architecture.*