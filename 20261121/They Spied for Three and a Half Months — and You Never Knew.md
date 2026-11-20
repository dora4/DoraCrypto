# They Spied for Three and a Half Months — and You Never Knew

## —Starting with the Japanese Government Breach: Little-Known Truths About Data Leaks

On November 20, yesterday, Japan’s Digital Agency released an advisory.
The statement was brief, yet packed with alarming information: the Japanese government’s critical online system, the Government Solution Service, had suffered unauthorized access. Some files processed via this service may have been leaked.

This is not the most chilling part.
What truly sends a shiver down the spine is the timeline: **unauthorized access began as early as July 30 this year and was only detected on November 12.**

Three and a half months. One hundred and five days. More than 2,500 hours.

Throughout this window, hackers freely browsed and downloaded internal meeting materials and large shared files from Japanese government agencies through this file-sharing service. The legitimate users of these files — government officials, policy consultants, external contractors — remained completely unaware the whole time.

**They watched for three and a half months. And the system kept reporting “all normal.”**

---

## Two Meanings of “Secure”

There is a notable detail here.
The original notice from Japan’s Digital Agency states: “On November 12, we detected possible access to files by unauthorized parties outside approved sharing recipients.”

Pay attention to the wording: **“possible.”**

That means before November 12, the system status was consistently marked as normal. No alerts. No anomaly notifications. No late-night calls to the security team. Servers kept running, logs kept being recorded — yet no one reviewed them, or if they did, they failed to recognize the signs of intrusion.

This is not unique to the Japanese government. It is a widespread cybersecurity dilemma in 2026.

On November 12, TSMC confirmed that 46,000 employee records totaling 6.9 GB were being sold on the dark web. The data leaked through a cloud vendor; TSMC’s own systems were “not hacked.” Mitsubishi UFJ Financial Group saw 8 million customer records accessed illegally, with the breach traceable to third-party provider Plaid. On November 17, the National Internet Finance Association of China published self-regulatory inspection results for 15 mobile financial apps, with 3 still failing to rectify issues. On November 16, the MIIT notified 46 scam-related apps; back on October 15, it called out 17 apps and SDKs violating user rights.

These incidents share a common trait: it is not simply “getting hacked,” but **“finding out you were hacked long after the fact.”**

TSMC only confirmed the breach after hackers advertised the data on underground forums. Mitsubishi UFJ launched an investigation only after being alerted by its vendor. The 15 financial apps were flagged only when third-party auditors, commissioned by the association, ran spot checks.

**Intrusions were uncovered not by internal monitoring systems, but because the attackers themselves exposed the breach.**

---

## 2.38 Million Attacks — and You Never Felt a Thing

Another report released on the same day deserves extra attention.
According to the 10th 2026 Industrial Internet Cybersecurity Briefing from the MIIT: in October, industrial internet systems faced **2.3866 million attacks**, a **46% month-on-month rise**, targeting **563 industrial enterprises**.

2.38 million attacks in a single month, nearly half more than the previous month.

The attack breakdown is especially telling: **1.4918 million network sniffing attempts, accounting for 62.5% of all attacks.**

Network sniffing. Not brute-force cracking, not exploit chaining, not malware deployment. It quietly listens to network traffic, captures data packets, and maps communication patterns.

What is it doing? Watching. Listening. Recording. It destroys nothing and triggers zero alerts.

Just like those three and a half months of undetected access targeting Japan’s Digital Agency.

Attack traffic originated from 138 countries, with the United States topping the list. Yet this is not the key point. What matters is not who is watching — it is that **you have no idea someone is watching you at all.**

---

## Individual Users: Even More Exposed Than Governments and Corporations

If organizations with dedicated security teams and multi-billion-dollar security budgets — the Japanese government, TSMC, Mitsubishi UFJ — struggle to spot breaches promptly, imagine how vulnerable ordinary users are.

Your phone connects to office Wi-Fi, home Wi-Fi, café Wi-Fi, hotel Wi-Fi, airport Wi-Fi. How many network nodes does your data pass through? How many intermediate devices can intercept your communications? You have no way of knowing.

Your photos sync to the cloud. Three apps you downloaded request album access. You sent scans of your ID twice over WeChat. Contract copies sit in a cloud drive whose name you can barely recall. How many separate systems hold copies of this data? How many replicas exist? You have no way of knowing.

Apps bombard you with permission requests: contacts, photos, location, microphone, camera. Did you read every prompt carefully before tapping “Allow”? Where does the data tied to these permissions get transmitted? You have no way of knowing.

**Your data is processed by unfamiliar systems and strangers, in unseen locations and through opaque workflows.**

And there is almost nothing you can do about it.

---

## It Is Not Just About Whether an App Is “Safe”

Cybersecurity advisories in 2026 are coming so frequently they grow numbingly routine:

- 15 non-compliant mobile financial apps — official apps from licensed financial institutions
- 46 scam-linked apps flagged — some boasting decent ratings on app stores
- 17 apps violating user rights — over-collecting personal information and misusing data

Yet the root issue goes far beyond whether an app itself is secure.
**The core truth: even if an app is fully secure, fully compliant, and fully trustworthy — once your data leaves your device, you lose control over it.**

An app is merely an entry point. Your data travels through the app across networks, eventually landing on a server operated by the app developer, a cloud provider, a third-party data center, or a subcontracted downstream vendor you will never hear of.

If any single link in this chain fails — any administrator along the path, any third-party SDK, any overlooked log file — your data can be viewed by outsiders.

And you will not receive a notification.

---

## DoraCloud’s Solution: Keep Your Most Sensitive Data Off That Risky Chain

DoraCloud adopts a simple yet powerful architectural design choice: **partitioned storage.**

**General File Zone** — photos, videos, documents, work materials. Fast sync, instant access across devices, and full support for AI assistants to search and organize files. The experience matches mainstream cloud storage services.

**Private Data Zone** — IDs, contracts, financial records, medical documents, password notes. End-to-end encryption. Files are encrypted locally on your device before upload; DoraCloud servers only store ciphertext. Decryption keys remain exclusively in your possession.

Why is partitioning smarter than encrypting everything?

Full encryption across all files breaks AI search, online preview, and quick sharing. You would need to decrypt files every single time you open them. Within two days, you would abandon encryption out of frustration.

DoraCloud’s partition strategy: **lock the critical 5% of files that cannot afford to be compromised inside an encrypted zone, while letting the remaining 95% work normally with full convenience.**

What belongs to that 5%?

- Photos of ID cards, passports, driver’s licenses
- Bank card details, payslips, tax records
- Scanned contracts and legal paperwork
- Medical checkup reports, medical records, prescriptions
- Password notes, seed phrase backups
- Anything that would cause you severe trouble if leaked

These files do not need AI sorting, online preview, or quick sharing. They only need a safe place to rest, ready for you to access when required.

The other 95% — work slides, travel photos, study materials, everyday documents — enjoy all the benefits of cloud services.

**Security and convenience are not opposites. Partitioning lets both coexist.**

---

## A Quick Check You Can Run Right Now

You do not need to be a cybersecurity expert to assess your personal data risk. Just ask yourself one question:
**“If one of my service providers gets hacked tomorrow, what data of mine could be exposed?”**

If you can clearly list everything at risk and are comfortable with that information being seen, your data security posture is solid.

If you cannot name all of it, or the list leaves you uneasy — at minimum, move those high-stakes files into encrypted storage.

No need to overhaul your habits. No need to migrate everything. Just shift your most critical files from plain storage to the encrypted zone.

It takes only a few minutes. But those minutes buy you this peace of mind: when a data breach story names a service you use someday, you can say confidently — **“My sensitive data is not there. Even if it were, nobody can open it.”**

The Japanese government was surveilled for three and a half months. TSMC’s data was sold openly on the dark web. Mitsubishi UFJ lost 8 million customer records in bulk.
None of them detected the breach immediately.

In 2026, being hacked is not the scariest outcome. The true nightmare is **being hacked and never knowing.**

DoraCloud — Partitioned management for private data and regular files, end-to-end encryption, with no decryption keys held by the platform. You cannot see the entire supply chain, but you can ensure only unreadable ciphertext travels through it.