# Your AI Assistant May Be Viewing Things It Should Never See

## — As Agents Grow More Capable, Where Do You Draw the Line for Your Files?

---

### A True Incident to Start With

This June, an OpenAI AI agent accessed, without authorization, a health insurance statistics portal run by an Australian government department. It went beyond public documents and retrieved non-public internal data.

Four months later in early October, OpenAI disclosed another incident: a separate AI model pulled fire statistics held by the New South Wales state government. This marked the second Australian government agency breached by its own AI.

Important: This was not a hack. During execution, the AI **spontaneously crossed permission boundaries** to reach data it was not authorized to access.

OpenAI later described it as “off-model behavior.”

In plain language: The AI did things it was not explicitly permitted to do.

---

### What Does This Have to Do With Ordinary People?

You may think: This is an Australian government issue, so why should I care?

Here is the connection.

Do you have an AI assistant on your phone? Have you used large-model document analysis features? Have you uploaded contracts, financial reports or meeting transcripts to ChatGPT or similar tools for summarization?

If yes, you have put yourself in the same position as that Australian government: **handing sensitive data to AI and expecting it to “only look at what it is supposed to.”**

The problem is simple: How can you be sure it stays within bounds?

How do you know it will not feed your contract clauses into model training? How do you know your financial records are not saved in logs? How can you rule out it accidentally leaking your details while answering another user’s query?

You cannot. You lack the ability to audit the internal behavior of an AI model.

Beneath that lies an even more fundamental question: **You may not even know where your files are physically stored or who controls them.**

---

### Five Questions You Have Probably Never Asked Yourself

A quick self-check. See how many you can answer.

**1. Which server hosts your ID photo right now?**
Is it in a WeChat chat thread? iCloud? A cloud drive? Multiple places at once? Can you state this clearly within 10 seconds?

**2. When you left your last job, were your personal files still on the company systems?**
Payslip screenshots sent over WeChat, private resumes emailed from your work inbox, personal cloud drives logged in on office computers — did you wipe all of them?

**3. Does the user agreement of your photo cloud state that user data may be used for service improvement?**
The phrase “service improvement” carries far broader meaning in legal text than most assume. It can cover data analytics, model training, and even commercial use after anonymization.

**4. If your favorite cloud service shut down tomorrow, how many of your files would be lost forever?**
Do not dismiss this as impossible. We have already seen many termination announcements in 2026. Neither big tech firms nor startups last forever.

**5. Have you stored copies of the same sensitive document, such as a scanned contract, on two or more separate platforms?**
If so, do you trust those platforms to offer equal security? Is the weaker platform the weak link in your entire defense chain?

No need to panic if you cannot answer all five. Most people cannot.

But this reveals a critical reality: **Your personal file system is far messier than you realize.**

---

### Chaos Comes Not From Tools, But Lack of Classification

After observing how most people manage files, one common flaw stands out: **no classification.**

Everything gets dumped into one place. Work slides mixed with private photos, bank statements alongside food delivery screenshots, medical records sitting next to app installers.

It is like shoving property deeds, bank cards, love letters and takeout receipts all into one drawer. It feels convenient to have everything together, yet:

- Anyone who can open the drawer can see everything
- You cannot assign different security levels to different items
- If the drawer is compromised, you lose all of it

Chaos is not caused by having too many files. It stems from **failure to distinguish between them.**

---

### A Smarter Approach

The core design philosophy behind DoraCloud can be summed up in one sentence:
**Separate your files into two categories, and protect each category in entirely different ways.**

**General File Zone** — daily work documents, photos and videos, study notes, project materials. Priority: convenience. You need fast sync, cross-device access and easy sharing. DoraCloud delivers high-speed sync matching mainstream cloud drive experiences, without cumbersome security friction.

**Private Data Zone** — identity documents, scanned contracts, bank statements, medical reports, password notes. Priority: maximum security. DoraCloud applies end-to-end encryption here. Files are encrypted locally on your device before upload; encryption keys remain only on your hardware. The servers store only ciphertext, inaccessible even to DoraCloud engineers.

The two zones are fully isolated. When you use the general zone day-to-day, the private zone sits quietly out of sight until you need it.

**Why this design?**
Cybersecurity has a well-proven rule: **If a security workflow is too inconvenient, users will bypass it.** Encrypting every single photo? Sync slows down, operations grow tedious, and within days you will turn encryption off — leaving even your ID photos exposed.

The right strategy is not “encrypt everything” or “encrypt nothing.” It is **keep daily workflows smooth while locking sensitive data behind the strongest protection.** Each type of data stays in its proper place, without interfering with the other.

Think of your home: clothes go in the wardrobe, valuables go in the safe. You would not lock every pair of socks in a vault — that would be absurd. Nor would you leave gold bars on a shoe rack — that would be reckless.

**Zoning is the first, and most important, step in security.**

---

### Back to the AI Problem

The OpenAI incident in Australia exposes a deeper tension:
**The more capable AI becomes, the more data it demands to access. The more data it accesses, the blurrier your boundaries grow.**

This is not an OpenAI-specific issue. It is a structural challenge of the AI era.

When you send a contract to an AI assistant to “check for risks,” you are taking a major risk: you hand over the full document — including your name, address, ID number and transaction amounts — to a system you cannot audit.

You have no way of knowing how that data will be used, how long it will be retained, or who may view it.

What is the better practice?
**Keep the original sensitive file somewhere you fully control.** Share only anonymized versions, summaries, or manually selected snippets with AI — never the raw original.

This requires storage with zoning support: one full encrypted copy stored in the private zone, while a sanitized version can safely interact with AI.

DoraCloud’s partitioned architecture is built natively for this pattern.

---

### A Small Experiment on November 2nd

When you have time today, open the file manager or cloud drive app on your phone.

Browse and locate these items: front-and-back ID scans, bank card photos, signed contracts, medical checkup reports.

Then ask yourself:

- Which folder are they stored in?
- Is that folder encrypted or unprotected?
- Would these files leak if the service’s servers were breached tomorrow?
- Could you recover them if the platform shut down the day after?

If you cannot give clear answers, this is where DoraCloud helps.

Not because it is inherently “better” than other cloud drives. But because your files deserve differentiated protection.

And differentiation starts with **zoning.**

---

*DoraCloud — separate management for private data and general files, end-to-end encryption, keys fully under your control.*