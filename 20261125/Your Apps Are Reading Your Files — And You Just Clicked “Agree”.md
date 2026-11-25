# Your Apps Are Reading Your Files — And You Just Clicked “Agree”

**— Drawing on MIIT’s 60th Batch of Notices: What Is “Legal Snooping”?**

On November 23, China’s Ministry of Industry and Information Technology (MIIT) released its 7th 2026 notice on apps violating user rights — the 60th cumulative batch.

This round focused on a special campaign targeting commercial pop-up ads. Twenty-three apps and SDKs were caught with issues such as pop-ups that redirect arbitrarily and pop-ups with no close button. The official notice uses restrained wording, yet the message is clear: pop-ups are just the tip of the iceberg. Beneath them lies a double harvest of user attention and personal data by apps.

Earlier the same month, the 6th notice issued on October 15 laid out more direct violations for 17 apps and SDKs: illegal collection and misuse of personal information.

Two batches, two months, forty products in total.

You might think: only forty apps, out of millions available on app stores.

But look at it another way: these are only the ones that were detected. MIIT relies on random inspections by third-party labs — spot checks, not full audits. The failure rate among sampled apps is high enough to warrant public notices. What about those never sampled?

**You have no way of knowing. All you know is that you clicked “Agree”.**

---

## A Contract You Never Read

Every time you install an app, you are shown a User Agreement and Privacy Policy.

I’ve crunched the numbers: mainstream cloud drive privacy policies run an average of 8,000 to 15,000 words. That equals roughly 20 to 40 minutes of reading time. Yet stats from the App Store and Google Play show that from tapping Install to tapping Agree, the average user takes **less than 8 seconds**.

Eight seconds. You barely finish reading the title.

What exactly did you consent to?

Take a popular cloud drive’s privacy policy as an example (unnamed, because nearly all players use similar language). It typically contains clauses like these:

**1. Data usage rights.** “You grant us a worldwide, royalty-free, sublicensable license to use content you upload to provide and improve our services.” — Translation: the platform may use your uploaded files for “service improvement”. What counts as improvement? Training AI models? Tuning recommendation algorithms? The policy does not specify.

**2. Third-party sharing.** “We may share your information with affiliates and partners.” — Translation: your data does not stay only with this company. You will not be told every single recipient.

**3. AI processing.** “To enable smart search, document parsing, image recognition and other features, your content may be sent to our AI processing systems.” — Translation: every file you upload gets read by their AI. Not for human spying — to power features. But the act of reading still happens.

**4. Cross-border data transfer.** “Your data may be stored and processed in any country where we operate.” — Translation: your files could end up in servers in the US, Singapore, Ireland, or anywhere else.

These are not predatory clauses unique to one provider. This is standard industry practice. Switch to almost any mainstream cloud storage, and the wording will be nearly identical.

**You are not merely using a service. You are signing a contract with zero negotiating power.**

---

## What Is the Line Between “Reading” and “Snooping”?

Some argue: AI reads files for features, not humans.

Technically, that is true. Cloud drive AI pipelines run automatically. After upload, systems extract feature vectors, build indexes for search and recommendations. No human sits behind a screen scrolling through your scanned contracts.

But here is the critical catch: **once data is processed, new derived data is created.**

When your scanned contract is parsed by AI, the system generates extracted text, metadata tags, semantic embeddings. Where are these derived records stored? How long are they kept? Who can access them? What else will they be used for?

You will not find those granular details in the privacy policy.

Deeper still: during AI processing, your file exists in plaintext in system memory. Transmission may be encrypted, but decryption must happen at the processing stage — otherwise the AI cannot understand the content.

**That means, for those few milliseconds, your file is fully exposed.**

What if the system is compromised in that window? What if attackers do not need to steal your full file — only the intermediate data generated during AI analysis?

This is not hypothetical. On November 16, 2026, websites belonging to 178 organizations globally were compromised via the Optimizely vulnerability. Malicious JavaScript injected by attackers stole data exactly when it was decrypted in browser memory during rendering.

Same principle: theft does not happen at rest or in transit. It happens **during processing**.

**Your file is seen at its most vulnerable moment.**

---

## Is There an Option That Does Not “Read” Your Files?

Yes. But it comes with a tradeoff.

DoraCloud’s core design can be summed up in one sentence: **We do not read your private files.**

Not a promise to refrain from reading. A technical impossibility.

DoraCloud splits storage into two zones:

**General File Zone** — photos, videos, work documents, study materials — uses a high-speed sync channel. This matches the experience of mainstream cloud drives: instant multi-device access, online preview, AI search, smart organization. All the convenience features you expect are available here. Convenience and basic security coexist for non-sensitive files.

**Private Data Zone** — ID photos, bank statements, original contracts, medical records, wallet seed phrase screenshots — runs on end-to-end encryption. Files are encrypted locally on your device before upload. The server only stores ciphertext. DoraCloud servers never hold your decryption keys, so **the platform cannot read these files by design**.

AI search? Disabled for private zone files. Online preview? Requires decryption locally on your device. Smart recommendations? Private zone data is excluded from training datasets.

You give up some conveniences: private zone files cannot open instantly in the browser or be auto-sorted by AI. In return, you gain something far more important:

**Your sensitive data never appears as plaintext on DoraCloud servers at any point after upload, not even for a millisecond.**

---

## A Choice to Make

Back to the MIIT notice.

Twenty-three apps were cited for broken, uncloseable pop-ups. These are visible problems: the pop-ups jump right in front of you, and you know they are annoying.

What about the invisible ones? How many times have your files been parsed by AI? How many countries have they been transferred to? Which third parties received copies? How long will they be retained?

You do not know. And you will never know — because you clicked Agree in 8 seconds.

This is not your fault. It is a fundamental architectural limitation. Traditional cloud storage must read your data to deliver features. It is like a restaurant that has to look at your ingredients to cook your meal; it cannot prepare food without seeing your basket.

DoraCloud reworks this architecture. General files work as usual, while private sensitive files live in a separate system built without data reading.

It is not a revolutionary concept. It is simple logic:

**If a service’s business model requires you to hand over control of your data, you no longer control that data.**

DoraCloud simply gives control back to you — at least for the files that matter most.

---

How many apps on your phone have read your files today? Have you counted?

Maybe it is time to start.