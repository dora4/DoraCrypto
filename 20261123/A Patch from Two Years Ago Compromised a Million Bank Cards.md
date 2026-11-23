# A Patch from Two Years Ago Compromised a Million Bank Cards

## — When Patching Stops Being a Security Strategy and Encryption Takes Over

On November 20, a low-profile technical story circulated within cybersecurity circles.

Attackers exploited a Windows vulnerability, CVE-2024-49138, for which Microsoft released a fix back in December 2024. They breached more than 700 POS payment terminals across over 20 countries and stole data tied to at least one million credit and debit cards.

You read that correctly. A patch issued two years prior was still failing to protect hundreds of devices in November 2026.

Why?

Because those POS terminals were never patched.

They ran outdated builds of Windows 10; some were even still on Windows 7. Microsoft had long published the fix, yet the devices never received it — or more precisely, their operators never installed it.

After gaining access, attackers deployed remote-access trojans on compromised terminals to siphon transaction data continuously. Stolen records included card numbers, issuing banks, expiry dates, country of issue and card network details. This dataset is valuable for sale on underground marketplaces and can be used to clone cards for fraudulent withdrawals.

One million cards, across 20+ countries, with the bulk of affected systems located in Brazil, where retailers widely rely on old Windows deployments.

The tally may still rise. Researchers found exposed servers remained online until late August 2026, while the trojan operated undetected for months before being reported to local cybersecurity authorities.

**A two-year window of exposure. A million cards compromised. A patch that already existed.**

---

## Patching Is Not a Security Strategy

The cybersecurity industry holds a deeply ingrained assumption:
**Timely patching equals security.**

In theory, this works neatly. Vulnerability discovered → vendor releases patch → user applies patch → hole sealed. A perfect closed loop.

But reality tells a different story.

The patch from December 2024 remained uninstalled on countless devices as late as November 2026.

Billions of devices worldwide run varied operating system versions, and a large share will never receive modern updates. Some hardware is too old to support them; admins may lack awareness; updates can disrupt business operations; many deployments have no dedicated IT budget at all.

Attackers do not need zero-day exploits. They only need to hunt for flaws with publicly available, long-neglected patches to walk straight in.

**The fundamental flaw of the patch model is its assumption that everyone will update promptly — an assumption that will never hold true.**

This is not a Brazil-only problem. Delayed or skipped updates are the norm, not the exception, across consumer and enterprise hardware globally. Your phone may sit on a two-year-old OS build. Your company servers may run an end-of-life operating system. Your NAS may never have had its firmware updated.

Every unpatched device is an unlocked door.

And attackers only need to find one.

---

## What Is Inside Once the Door Opens?

Let us reframe the scenario.

Suppose an attacker has already gotten in — via a years-old flaw, an unremediated system, a forgotten IoT or payment device. They are inside.

What do they see?

**Scenario A: Data in plaintext.**
The attacker browses your folders: scanned contracts, financial statements, customer records, payroll documents, ID photos — all readable. They bulk-download everything, and you later receive a ransom note.

Worse still, they may skip ransom demands and sell your records straight onto the dark web. Your identity details circulate on underground markets, used for targeted phishing, identity theft and fraudulent loan applications. You might only discover damage to your credit report months later.

**Scenario B: Encrypted data, with keys held by the service provider.**
The attacker finds encrypted files, but also takes over your account credentials. Since your encryption setup relies on an online service for key management, they can decrypt your files. The end result is identical to Scenario A.

**Scenario C: Encrypted data, keys held locally only.**
The attacker sees encrypted files: unintelligible binary data. Without the key, these files are meaningless noise. They cannot tell what the files contain or how to unlock them.

They may delete the files (you restore from separate backups). They may encrypt your system to demand ransom (your backups live elsewhere, safe). But **they cannot read your data.**

Scenario C is the only state that stops harm after a breach. It does not prevent intrusion entirely — it prevents meaningful damage once intrusion happens.

**That is encryption’s true purpose. It is not a city wall. It is a safe. Walls can be breached; what sits inside the safe stays protected.**

---

## Why Was None of That Million Card Data Encrypted?

Back to the POS breach.

One million card records were exfiltrated: card numbers, expiry dates, issuer details, CVVs.

Why was this data unencrypted?

POS terminals must hold this information in memory as plaintext while processing payments. This is inherent to how payment flows work: the card number is read from a chip or magnetic stripe, validated, and transmitted to the acquiring processor. While “live” in the transaction pipeline, the data is readable.

The attacker’s trojan exploited exactly this behaviour: it captured transaction data from memory, before encryption took place.

This is a unique technical constraint for the payments industry. The lesson for individual users, however, translates directly:
**Your data is most vulnerable while in use.** When you open a file, edit a document, transfer records or run backups — every moment of active use creates a window where data exists in readable form.

Encrypted storage solves a separate problem:
**When your data is not actively being used, it should stay locked.**

Your scanned contract should remain encrypted when you are not viewing it. Your ID photo should stay locked when unused. Your bank statement screenshots should be secured when you do not need them.

This is what DoraBox is built to do: place a lock only you hold the key to, for your data whenever it is idle.

---

## Why “Only You Hold the Key” Matters So Much

Encryption tools are abundant, and many cloud storage platforms advertise encryption. Yet their underlying architecture reveals a critical distinction:

**Most encryption schemes leave key custody with the service provider.**

Why? Providers need access to keys to power convenient features: in-browser preview, full-text search, AI tagging, seamless cross-device sync. Many of these features become impossible if keys remain solely with the user. Providers settle on a compromise: encrypt your files, but keep a copy of the key themselves.

It is like storing valuables in a bank safe. The bank advertises state-of-the-art physical security, and you trust it — yet you do not hold the only key. The bank keeps a spare. If the bank is robbed, if an insider abuses access, or if authorities compel access, your safe is no longer secure.

DoraBox takes the opposite approach: **keys remain exclusively with you. The server never touches your encryption keys.**

This means even if DoraBox’s servers were hypothetically compromised, attackers would only obtain encrypted blobs. Without keys, the data is useless noise.

This means even if a third party hypothetically compels DoraBox to hand over your stored data, the platform cannot comply — decryption is technically impossible on their side.

**“We promise not to look at your data” and “we are technically unable to read your data” are two entirely different security levels.**

The first depends on goodwill. The second depends on mathematics.

Goodwill can shift. A company may be acquired, policies revised, staff may violate rules, court orders may be issued. Mathematics does not change. The security strength of 256-bit AES does not hinge on anyone’s intentions; it is bounded only by the physical limits of computing power.

---

## The Two-Year-Old Patch, and Today’s Lock

Patching is reactive. Vulnerabilities are disclosed, fixes are published — but you may never successfully deploy them.

Encryption is proactive. Whether vulnerabilities exist or patches are applied, your sensitive data remains unreadable the moment it is stolen.

I am not dismissing patching. Keeping systems and software updated and remediating known flaws remains baseline security hygiene and should be maintained.

But patches are not infallible. The cardholders behind those million records likely assumed their systems were secure. Few of the 700 POS operators likely realised a two-year-old critical patch had never been installed.

**You cannot guarantee every system gets patched on time. But you can guarantee your highest-value data stays protected, even when patches are missing.**

The solution is simple: keep your most important assets inside a box no one else can open.

DoraBox — Your data, accessible only by you.