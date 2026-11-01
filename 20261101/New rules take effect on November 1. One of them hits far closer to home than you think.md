# New rules take effect on November 1. One of them hits far closer to home than you think

## — Standards for patient companionship and large AI models are now here. What about your files?

Today marks the first day of November.
If you scroll through the news, you may spot an easy-to-miss update: starting today, the first national standard for patient companion services officially goes into force. It clearly defines what a patient companion can and cannot do, how pricing works, and how patient privacy should be protected.

There is another, more technical announcement: four national standards for large-model data security also take effect today. They cover data processing, model training, model inference and computing resource scheduling, essentially regulating the full lifecycle of AI large models.

You might ask: What does the patient companion standard have to do with me? And I don’t work in AI, so why should I care about these large-model standards?

Hold on. Think one step further.

One core concern behind the patient companion standard: **When you hand over your health status, medical records and medication history to a stranger, how do you guarantee this information will not be misused?**

One core concern behind the large-model standards: **When your data is fed into AI for “training” and “inference”, how do you make sure it stays unseen by unauthorized parties?**

These two questions boil down to the same fundamental issue:
**Who gets to view your files?**

---

## A number you may have overlooked

IBM released its annual Cost of a Data Breach Report this year.
Its key finding: the average global cost of a data breach has reached **4.99 million US dollars**, up 12% year-on-year and hitting an all-time high.

The two fastest-growing attack vectors:

- AI deepfake identity impersonation
- AI-generated malicious malware

Put simply: Attackers now use AI to impersonate your boss in emails, craft phishing links that look perfectly legitimate, and mimic your colleague’s voice over phone calls.

Defending against them feels nearly impossible. It is not that your security awareness is poor; attack techniques have evolved to the point where they are **indistinguishable to the naked eye**.

Against this backdrop, your contracts, ID photos, financial records and medical reports — files sitting on some cloud drive — sit worlds apart from that $4.99 million figure in terms of security safeguards.

---

## The difference between “stored” and “securely stored”

I have a friend who works as an independent photographer.
Last year, she stored three years of client materials — portrait authorization forms, contracts, quotations, client contact details — all on a mainstream cloud drive. Early this year, the platform adjusted its free quota and locked her account. When she contacted support, she was told she needed to upgrade to a paid plan.

She paid the fee. But she told me something that stuck with me: “I suddenly realized these files were never truly mine.”

She was right.
There is a world of difference between a file being **stored somewhere** and being **securely stored**.

**“Stored” means:**
The file sits on a server and you can access it via an app.

**“Securely stored” means:**
The file is encrypted, decrypted only by you. No one can peek at it even if the server is breached. Your data survives even if the provider shuts down. It remains safe and follows you across three different phones.

Most people stop at “stored”. They mistakenly believe their files are “securely stored”.

---

## Do you know your files fall into two categories?

I’ve watched how people around me use cloud drives.
Everything gets dumped into one folder.
Photos, contract scans, ID copies, children’s report cards, payslips, travel videos, work slides — all mixed together. It’s like putting your property deed and a food delivery receipt in the same envelope and handing it to a courier for safekeeping.

This is no joke. It is the reality for most people in 2026.

What is the problem? **No separation.**

Your travel photos and bank statements have vastly different security requirements. Losing the photos may only bring heartache; losing your bank statements can expose you to targeted fraud for a whole year. Yet you store them in the same place with identical protection.

**Either encrypt everything (too slow and cumbersome, so you will turn it off eventually), or encrypt nothing (convenient but risky).**

This is a trap with only two bad options.

---

## DoraCloud’s third way

DoraCloud is designed specifically to break this binary trade-off.
It does one simple thing: **splits your files into two zones.**

**General File Zone** — Photos, videos, documents, slides, everyday files. It uses a high-speed sync channel for instant cross-device access, with an experience identical to mainstream cloud drives. You notice zero extra friction.

**Privacy Data Zone** — IDs, contracts, financial records, medical files, password notes. It runs over an end-to-end encrypted channel. Files are encrypted on your device before upload, and keys remain exclusively in your hands. Only ciphertext is saved on the server; even DoraCloud engineers cannot unlock it.

The two zones operate independently. Your regular workflow stays untouched — syncing and sharing work as normal. But that sensitive 5% of your files sits quietly inside a safe whose key belongs only to you.

Why this design?
A simple truth: **If a security tool is too inconvenient, people will bypass it.**
Encrypting every single photo slows syncing and adds tedious steps. Eventually you will think “it’s not worth the hassle” — and your ID photos lose protection too.

DoraCloud’s logic keeps everyday files fast and fluid, while wrapping your sensitive files with maximum protection. **Each belongs in its right place, with no compromise.**

Think of your home: clothes go in the wardrobe, property deeds in the safe. You would not lock every pair of socks in a vault, nor leave your purchase contract casually on a shoe rack.

---

## “Who holds the keys?” — One question to remember

If you only keep one cybersecurity lesson for life, let it be this:
**Encryption is not mainly about whether encryption is applied. It is about who controls the keys.**

Major cloud services also encrypt files. But the service provider holds the keys.

What does that mean?

- Engineers or insiders at the provider can theoretically view your files
- The provider’s AI systems may analyze your file content
- When served with legal orders, the provider can decrypt and hand over your data
- If the provider is hacked, attackers may gain access to the keys

DoraCloud works differently. Files are encrypted locally on your device, and keys never leave your device. The DoraCloud server only holds ciphertext.

This is not a question of “trusting DoraCloud not to peek”. It is that **DoraCloud is technically incapable of peeking.**
Cryptography relies not on trust. It relies on math.

---

## Back to the two new standards taking effect today

The patient companion standard says: your medical records cannot be shown to a companion casually, cannot be stored without permission, and cannot be shared freely.

The large-model standard says: data fed into AI must have clear boundaries. Training data cannot be reused arbitrarily for inference, and inference outputs must not leak training data.

Both standards answer the same core question: **In the information age, who can and cannot see your data?**

The state answers this question with regulation. DoraCloud answers it with product design.
Different angles, same goal: **You should decide who gets to see your data.**

---

## One small thing you can do on November 1

Open the cloud drive app on your phone.
Take a quick look: do you have ID photos, bank screenshots, scanned contracts, payslips, medical reports, or your child’s birth certificate saved there?

If yes — are they sitting in a regular folder or inside an encrypted zone? Do you know who holds the encryption keys for your cloud storage?

If you cannot answer those questions, that is where DoraCloud helps.
Not because it is fancier than other cloud drives. But because your files deserve differentiated protection.

---

*DoraCloud — Separate management for privacy data and general files, end-to-end encryption, no decryption keys held by the platform.*