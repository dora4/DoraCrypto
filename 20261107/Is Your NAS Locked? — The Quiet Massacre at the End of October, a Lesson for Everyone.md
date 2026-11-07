# Is Your NAS Locked? — The Quiet Massacre at the End of October, a Lesson for Everyone

## Synology NAS Hit by Cerber Ransomware, Over 100,000 Devices Compromised. Your Photos, Contracts and Backups All Turned Into .L0CK3D

Late October 2026.
No product launches. No headline news. Most people had no idea what was unfolding.
But within the cybersecurity community, a quiet massacre was underway.

Exploiting two critical high-severity vulnerabilities in Synology NAS (Network-Attached Storage) — CVE-2026-13639 and CVE-2026-13684, with a CVSS score of **9.8 out of 10** — threat actors launched a large-scale ransomware campaign against Synology devices worldwide.

The attack method was remarkably “sophisticated”:
✅ **No account credentials required.**
✅ **No user click needed.**
✅ **No prior permissions required.**

Attackers could remotely read and write any file on the device directly. The barrier to entry was shockingly low: if your Synology NAS was exposed online and lacked the patch released on September 18, it was vulnerable.

What was the outcome?
Every photo, document, archive and backup stored on your NAS got encrypted. Files were renamed with the suffix `.L0CK3D`. A ransom note was automatically generated in every folder, demanding payment in cryptocurrency for decryption.

A decade of family photos. Footage of your child’s birth. Original contracts. Scanned copies of ID documents.
**Overnight, all of them became inaccessible.**

---

## Why This Incident Stands Out

NAS breaches and ransomware attacks are nothing new.
What makes this Cerber campaign worthy of attention is that it exposed a common, underestimated misconception:

>
> **“Backups equal security.”**

Many people bought a NAS specifically for data backup: syncing phone photos, copying work files and archiving important documents there. The logic seemed solid: if your phone was lost or your PC broke, you still had a copy on the NAS.

This logic holds up against physical damage. Dropped your phone in water? No problem, the NAS has a backup. A hard drive failed? No problem, the NAS has a backup.
**But it crumbles completely in the face of cyberattacks.**

The reason is simple: a NAS is also an internet-connected device. Once the NAS is compromised, your so-called “backup” becomes an extra prize for attackers. Instead of improving your security posture, you have **expanded your attack surface**. Previously, attackers only needed to compromise one computer to steal your data; now they get your backups too.

Worse still, many NAS users rely on RAID for redundancy. RAID protects against data loss caused by single-drive failure, yet it is useless against ransomware. Ransomware alters file contents, and RAID will faithfully sync those tampered files across all drives in the array.

**Your triple protection setup (primary device + NAS backup + RAID redundancy) offers zero defense against this type of attack.**

---

## Why Attackers Succeeded So Easily

Synology had already released patches for these two vulnerabilities on September 18, 2026.
So why were so many people hit at the end of October?

It comes down to a well-known, persistent truth in cybersecurity:

>
> **There is a deadly gap between patch release and patch installation.**

Home users do not check NAS firmware updates daily. Many do not even realize NAS devices need security patches. They set up the NAS, enable auto-backup, then forget about it — much like plugging in a washing machine and never reading the manual again.

Attackers exploited this window of opportunity. From the September 18 patch release to the large-scale outbreak in late October, there was more than a month during which unpatched devices were wide open.

Even after applying patches, you are not fully safe. Security researchers have observed that the Cerber family keeps evolving its tactics. Closing one vulnerability today means attackers will hunt for another tomorrow.

>
> **The root issue is not any single vulnerability. Your data security should never rely on the hope that attackers cannot find a way in.**

---

## A Counterintuitive Takeaway: A NAS Is Not a Safe

I am not saying NAS is bad. NAS is excellent storage hardware: high capacity, reliable, supports multi-device sharing and works great as a home media server.

But there is a widespread misunderstanding of its role:

>
> **It is a storage appliance, not a security appliance.**

What a NAS can do: centralize your data and provide certain redundancy.
What a NAS cannot do: stop attackers from stealing or encrypting your data once they break through your network defenses.

This distinction matters.
Think of a NAS as a large warehouse. It is sturdy, fitted with cameras and fire suppression systems. But if someone gets hold of the key or picks the lock, everything inside is exposed.

**You do not need a bigger warehouse. You need a safe that remains unopenable even if the warehouse is breached.**

---

## DoraBox vs. NAS

DoraBox is not a NAS replacement. It is an entirely different category of product.
A NAS is storage. DoraBox is an encryption device.
They solve different problems:
✅ **What a NAS solves:** I need a central place to store my data.
✅ **What DoraBox solves:** My data must remain unreadable even if it gets stolen.

Specifically, DoraBox delivers capabilities NAS cannot:

1. **Keys stay solely in your possession**
   Zero-knowledge architecture. Encryption keys are generated locally on your device. They never leave your hardware and are never uploaded to any server. The DoraBox development team itself cannot access your keys.

That means even if threat actors obtain all your ciphertext stored on DoraBox — just like Cerber seized all files on compromised NAS devices — they only get meaningless noise. Without the key, the data is just unreadable bytes.
When a NAS is hacked, your files are exposed. If DoraBox is breached (hypothetically), your files stay encrypted.

2. **No plaintext exposure across the entire pipeline**
   Data is encrypted on your local device before transmission. It travels as ciphertext, stored as ciphertext on the server, and remains ciphertext after syncing to other devices. Decryption and preview only happen on authorized devices.

By contrast, NAS stores data in plaintext. The NAS operating system and its apps can read those files — and so can attackers who take over the NAS.

3. **Self-destruct mechanism**
   After repeated failed authentication attempts, the local key on DoraBox gets erased. Your ciphertext remains stored, but it turns into unintelligible data until you complete the full identity recovery workflow.

Brute-force attempts will not crack the safe. They wipe the key that unlocks it.

Cerber works by encrypting your files and demanding ransom for decryption. If your files are already encrypted inside DoraBox, Cerber’s encryption is applied on top of existing ciphertext. You get encryption layered over encryption. The inner key belongs only to you, and attackers can never touch it.

---

## Backups vs. Secure Backups

This Cerber incident lays bare a core flaw in most people’s backup strategy.
Ordinary backups are just **physical redundancy**: copying data to another location. This protects against data loss from hardware failure or lost devices, but it cannot defend against compromise — such as a hacked NAS or a stolen cloud account.

A **secure backup** adds one critical layer: the backup itself must be protected. Attackers cannot make use of it even if they steal it.

This is how DoraBox works alongside a NAS:
Keep your NAS for centralized storage and daily backups. But for your most sensitive data — ID documents, contracts, financial records and medical files — encrypt them via DoraBox first before saving them to the NAS.

Your NAS will only hold DoraBox ciphertext. Even if Cerber takes over the NAS and encrypts every file, it is encrypting ciphertext. Encrypted ciphertext is still ciphertext: useless garbage from the attacker’s perspective.

**The NAS is your warehouse. DoraBox is the safe inside that only you hold the key to. If the warehouse is ransacked, the contents of the safe stay protected.**

---

## A $200-Worth Piece of Advice

Synology did one thing right in this Cerber attack: it released patches a month ahead of the mass exploitation.
But a golden rule in cybersecurity holds true:

>
> **Patches only protect people who install them.**

If you own a NAS (Synology or other brands), take these three steps today:

1. **Check for firmware updates.** Log into your NAS admin panel and install any pending security patches immediately.
2. **Disable unnecessary remote access.** Turn off DDNS, QuickConnect, port forwarding and similar features if you do not need external access to your NAS.
3. **The most important step: store your sensitive files in DoraBox.** You do not need to encrypt everything — movies and music can stay on the NAS. But IDs, contracts, financial and medical records should be encrypted with DoraBox before being saved to NAS.

Once these steps are done, your data security is upgraded from warehouse-level protection to safe-level protection.

---

## The Final Fate of Those .L0CK3D Files

The cybersecurity community reached a rare consensus after the Cerber attack: **do not pay the ransom.**

Three reasons:

- Payment does not guarantee decryption (attackers vanish after receiving money in roughly 40% of cases).
- Paying ransoms incentivizes more attacks.
- Even if decryption succeeds, your data has already been exposed, and the risk of leakage cannot be eliminated.

Most owners ended up abandoning their encrypted `.L0CK3D` files. Years of photos, home videos and contracts turned into inaccessible fragments sitting idle on hard drives.

This is not purely a technical problem. It is a story of what could have been avoided.

>
> **You could have locked your most precious data away where no intruder could open it.**

---

*DoraBox — Privacy-Focused Encrypted Storage. Zero-Knowledge Architecture, Local Key Management, End-to-End Ciphertext Pipeline, Self-Destruct Protection. Your data stays unreadable, even if stolen.*