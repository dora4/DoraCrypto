# Who Is Actually Viewing Your Data Stored in Cloud Drives?

On October 4, 2026, Apple released a relatively under-the-radar announcement: it rolled out new privacy controls for Mac users and warned of rising risks when granting third-party software Full Disk Access.

On the same day, security researchers revealed that the system prompts for GPT-6 Sol Codex had been leaked — core confidential content of nearly 300,000 characters laid bare to the public.

These two incidents may seem unrelated, yet they point to the same truth: the digital space you assume is secure can be far more vulnerable than you think.

---

## What Do You Keep in Your Cloud Drive?

Try a simple thought experiment: open the cloud drive you’re using and count the categories of files stored inside.

Work documents, scanned contracts, ID photos, your child’s school transcripts, raw travel photos, corporate financial statements, medical checkup reports, bank statements… For most people, their cloud drive is essentially an unlocked digital safe.

Convenient? Absolutely. Access your files anytime, anywhere, sync across multiple devices, and generate shareable links with one click. But here’s the catch — convenience often comes at the cost of exposure.

Global data breaches rose by 37% year-on-year in 2025. Over 60% of breached data stemmed from misconfigured cloud storage services or failed access controls. It is not that hackers are overly powerful; the door was simply left unlocked.

## The Security Paradox of Cloud Storage

The security architectures of mainstream cloud drives today generally fall into three models:

**Model 1: Plaintext Storage**
Your files sit on servers in their original form, with the platform holding the decryption keys. The upside is fast search and rich features including online preview and full-text search. The downside: the platform can read your files, and that means others may too. Accidental actions by internal staff, abuse of administrator privileges, or legal data requests can lead to your files being involuntarily disclosed.

**Model 2: In-Transit Encryption**
Files are encrypted during upload and download, but decrypted and stored as plaintext on the server side. This is the approach adopted by most “secure cloud drives”. The flaw is that files remain unencrypted on the server. If the server is compromised, or the platform itself needs access, the encryption becomes meaningless.

**Model 3: End-to-End Encryption (E2EE)**
Files are encrypted locally before upload, and encryption keys stay solely in the user’s possession. Even if the platform’s servers are breached, attackers only obtain indecipherable ciphertext. The tradeoff: features such as online preview and full-text search will be limited.

## DoraCloud’s Design Philosophy: Tiered Protection and On-Demand Encryption

DoraCloud is not a traditional cloud disk. It acts more like an intelligent file manager that automatically assesses security levels based on file types and applies tailored storage strategies.

**Private data** (ID cards, bank cards, medical records, contracts, etc.): Automatically protected by end-to-end encryption. Keys are managed locally by users, and only ciphertext is stored in the cloud. Even if DoraCloud’s servers are hacked, attackers will get nothing but unreadable garbled data.

**Ordinary files** (photos, videos, documents, etc.): Protected by the standard combination of in-transit encryption and server-side encryption, preserving convenient functions like online preview and fast search.

**Sensitive folders**: Users can manually mark any folder as a safe vault, enforcing end-to-end encryption and requiring secondary authentication for access.

This tiered protection approach comes from a straightforward idea: not all files require the highest level of security, yet some files absolutely do. Universal maximum security compromises daily user experience, while universal low security fails you when it matters most. DoraCloud strives to strike a balance between the two.

## Why Data Security Matters Even More in the AI Era

Let’s return to the two news stories at the start.

Why did Apple strengthen Mac privacy controls at this time? Because in the AI era, the value of local data has skyrocketed. An AI app with Full Disk Access can theoretically read every file on your computer — including your synced cloud drive folders.

The GPT-6 prompt leak serves as another reminder: even top-tier AI companies cannot guarantee their core data will never leak. If OpenAI’s system prompts can be extracted, how secure do you think your work documents stored on a cloud drive really are?

DoraCloud’s answer is to return control to users. You hold the keys, and you decide what happens to your files. The platform does not act as an all-seeing administrator, but only as a faithful custodian.

## A Real-World Scenario

Suppose you are a freelancer and store a scanned copy of your non-disclosure agreement with a client in DoraCloud. One day, your cloud storage provider receives a request to cooperate with an investigation and hand over all user data.

On a traditional cloud drive, your agreement file would be read directly. With DoraCloud, investigators would only receive encrypted ciphertext. Without your private key, they cannot decrypt it. Your privacy is protected at the technical level, within the bounds of the law.

This is not about opposing anyone. It is about drawing a bottom line for yourself in an age where data is everywhere.

## Closing Thoughts

The Nobel Prize in Physiology or Medicine was announced this afternoon, honoring research delivering major benefits to human health. In the field of digital health, data security is emerging as an increasingly critical topic. Our bodily data, genetic data and mental health records are increasingly digitized and moved to the cloud.

What DoraCloud does is simple: make these truly private things truly yours.

Nothing more, nothing less — just enough.